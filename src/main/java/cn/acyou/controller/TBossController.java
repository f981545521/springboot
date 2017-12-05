package cn.acyou.controller;

import cn.acyou.pojo.TBoss;
import cn.acyou.service.TBossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author youfang
 * @date 2017-12-05 14:22
 **/
@Controller
@RequestMapping("/tboss")
public class TBossController {

    @Resource
    private TBossService tBossService;

    @RequestMapping(value = "/all",method = {RequestMethod.GET})
    @ResponseBody
    public List<TBoss> getAll(){
        return tBossService.getAll();
    }


}
