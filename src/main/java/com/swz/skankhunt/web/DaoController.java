package com.swz.skankhunt.web;

import com.swz.skankhunt.domain.ErrorInfo;
import com.swz.skankhunt.domain.p.UserinfoEntity;
import com.swz.skankhunt.domain.p.UserinfoEntityRepo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/userinfo")
public class DaoController {

    @Autowired
    private UserinfoEntityRepo userinfoEntityRepo;

    //查
    @ApiOperation(value="登陆", notes="输入账号密码登陆")
    //必须paramType=path，否则无法从路径中获得id值
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String" ,paramType ="query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String",paramType ="query")
    })
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public ErrorInfo<UserinfoEntity> getUser(@RequestParam String name , @RequestParam String password) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        UserinfoEntity byLoginNameAndPassword = userinfoEntityRepo.findByLoginNameAndPassword(name, password);

        ErrorInfo<UserinfoEntity> userinfoEntityErrorInfo = new ErrorInfo<>();
        if(byLoginNameAndPassword!=null){
            userinfoEntityErrorInfo.setData(byLoginNameAndPassword);
            userinfoEntityErrorInfo.setUrl("userinfo");
            userinfoEntityErrorInfo.setMessage("登陆成功");
            userinfoEntityErrorInfo.setCode(0);
        }else{
            userinfoEntityErrorInfo.setData(byLoginNameAndPassword);
            userinfoEntityErrorInfo.setUrl("userinfo");
            userinfoEntityErrorInfo.setMessage("登陆失败");
            userinfoEntityErrorInfo.setCode(100);
        }

        return userinfoEntityErrorInfo;
    }
}
