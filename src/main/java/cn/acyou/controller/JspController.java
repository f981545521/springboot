package cn.acyou.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author youfang
 * @create 2017-12-03 16:36
 */
@Controller
@RequestMapping("jsp")
@Api("JSP测试Controller")
public class JspController {
    //从 application.properties 中读取配置，如取不到默认值为HelloShanhy
    @Value("${application.hello:Hello Angel}")
    private String hello;

    @RequestMapping(value = "helloJsp",method = {RequestMethod.GET})
    @ApiOperation(value="helloJsp测试接口", notes="测试接口详细描述")
    public String StringhelloJsp(Map<String,Object> map){
        System.out.println("HelloController.helloJsp().hello="+hello);
        map.put("hello",hello);
        return "helloJsp";
    }

}
