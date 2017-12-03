package cn.acyou.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DEMO
 *
 * @author youfang
 * @create 2017-12-02 22:45
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("sample")
public class SampleController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
