package cn.acyou.controller;

import cn.acyou.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author youfang
 * @create 2017-12-03 22:00
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getUserName",method = {RequestMethod.GET})
    @ResponseBody
    @ApiOperation(value = "输入姓名年龄")
    public User getUserName(String name,Integer age){

        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setBirthdate(new Date());
        return user;
    }

    @RequestMapping(value = "/getUserInfo",method = {RequestMethod.GET})
    @ResponseBody
    @ApiOperation(value = "传入用户信息")
    public User getUserInfo(User user){
        return user;
    }

}
