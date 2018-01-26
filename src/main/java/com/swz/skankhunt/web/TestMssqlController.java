package com.swz.skankhunt.web;


import com.swz.skankhunt.domain.p.AlarmconfigEntity;
import com.swz.skankhunt.domain.s.PdLoginEntity;
import com.swz.skankhunt.domain.s.PdLoginEntityRepo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/testMssql")
public class TestMssqlController {

    @Autowired
    PdLoginEntityRepo pdLoginEntityRepo;

    //查
    @ApiOperation(value="获取pd 后台登陆表，测试sqlserver", notes="根据url的id来获取详细信息")
    //必须paramType=path，否则无法从路径中获得id值
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Int",paramType="path")
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public PdLoginEntity getUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return pdLoginEntityRepo.findOne(id);
    }
}
