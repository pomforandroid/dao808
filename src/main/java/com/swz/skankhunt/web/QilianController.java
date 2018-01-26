package com.swz.skankhunt.web;

import com.swz.skankhunt.domain.ErrorInfo;
import com.swz.skankhunt.domain.p.AlaramConfigEntiyRepo;

import com.swz.skankhunt.domain.p.AlarmconfigEntity;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/alarmConfig")
public class QilianController {

    @Autowired
    AlaramConfigEntiyRepo alaramConfigEntiyRepo;


    //增
    @ApiOperation(value="创建报警配置", notes="根据对象创建报警配置，有自增id，entity记得加这个@GeneratedValue(strategy = GenerationType.IDENTITY)")
    @ApiImplicitParam(name = "AlarmconfigEntity", value = "报警配置，id自增不用填", required = true, dataType = "AlarmconfigEntity")
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ErrorInfo postUser(@ModelAttribute AlarmconfigEntity alarmconfigEntity){
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数

//        Integer id = alarmconfigEntity.getId();

        AlarmconfigEntity save = alaramConfigEntiyRepo.save(alarmconfigEntity);
        ErrorInfo errorInfo = new ErrorInfo();
//        ErrorInfo<AlarmconfigEntity> alarmconfigEntityErrorInfo = new ErrorInfo<>();
//        alarmconfigEntityErrorInfo.setData(save);
        if(save!=null){
            //保存成功
            errorInfo.setCode(0);
            errorInfo.setMessage("保存成功");
            errorInfo.setUrl("alarmConfig");
            errorInfo.setData(save);
        }else{
            //保存失败
            errorInfo.setCode(100);
            errorInfo.setMessage("保存失败");
            errorInfo.setUrl("alarmConfig");
            errorInfo.setData(save);
        }
        return errorInfo;
    }

    //删

    @ApiOperation(value="删除报警配置", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "alarm config ID", required = true, dataType = "Int", paramType="path")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ErrorInfo deleteUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setUrl("alarmConfig");
        errorInfo.setCode(0);
        errorInfo.setData(id);
        String msg = "删除成功";
        try{
            alaramConfigEntiyRepo.delete(id);
        }catch (Exception e){
            //e.printStackTrace();
            errorInfo.setCode(100);
            msg = "删除失败";
        }
        finally {
            errorInfo.setMessage(msg);
            return  errorInfo;
        }
    }
    //改
    @ApiOperation(value="更新报警配置详细信息", notes="根据url的id来指定更新对象，并根据传过来的对象信息来更新对象详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "alarm config ID", required = true, dataType = "Int", paramType="path"),
            @ApiImplicitParam(name = "alarmconfigEntity", value = "实体config", required = true, dataType = "AlarmconfigEntity")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public ErrorInfo putUser(@PathVariable Integer id, @ModelAttribute AlarmconfigEntity alarmconfigEntity) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        //找的到才更新
        ErrorInfo errorInfo = new ErrorInfo();
        AlarmconfigEntity entity = alaramConfigEntiyRepo.findOne(id);
        if(entity!=null){
            alarmconfigEntity.setId(id);
            AlarmconfigEntity save = alaramConfigEntiyRepo.save(alarmconfigEntity);
            if(save!=null){
                errorInfo.setCode(0);
                errorInfo.setMessage("保存成功");
                errorInfo.setUrl("alarmConfig");
                errorInfo.setData(save);
            }else{
                errorInfo.setCode(100);
                errorInfo.setMessage("保存失败");
                errorInfo.setUrl("alarmConfig");
                errorInfo.setData(save);
            }

        }else {
            errorInfo.setCode(101);
            errorInfo.setMessage("没有查找到");
            errorInfo.setUrl("alarmConfig");
            errorInfo.setData(entity);

        }
        return errorInfo;
    }

    //查
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    //必须paramType=path，否则无法从路径中获得id值
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Int",paramType="path")
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public AlarmconfigEntity getUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return alaramConfigEntiyRepo.findOne(id);
    }




}
