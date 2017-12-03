package cn.acyou.controller;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author youfang
 * @create 2017-12-02 23:12
 */
@RestController
@RequestMapping("/hello")
@Api("HelloController相关api")
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(method = {RequestMethod.OPTIONS})
    public String hello() {
        return "Hello Spring-Boot";
    }

    @RequestMapping(value = "/info" ,method = {RequestMethod.GET})
    @ApiOperation(value="INFO测试接口", notes="测试接口详细描述")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="name",dataType="String",required=true,value="用户的姓名",defaultValue="张小三"),
    })
    @ApiResponses({
            @ApiResponse(code=200,message="成功返回！"),
    })
    public Map<String, String> getInfo(@RequestParam String name) {
        logger.info("当前输入：" + name);
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    @ApiOperation(value="LIST测试接口", notes="测试接口详细描述")
    public List<Map<String, String>> getList() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for (int i = 1; i <= 5; i++) {
            map = new HashMap<>();
            map.put("name", "Shanhy-" + i);
            list.add(map);
        }
        return list;
    }
}
