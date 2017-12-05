package cn.acyou.controller;

import cn.acyou.pojo.TBoss;
import cn.acyou.service.TBossService;
import cn.acyou.utility.ResultInfo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @ApiOperation(value = "普通查找BOSS列表",notes = "老板列表")
    public List<TBoss> getAll(){
        return tBossService.getAll();
    }

/*    @RequestMapping(value = "/all",method = {RequestMethod.GET})
    @ResponseBody
    @ApiOperation(value = "分页查找BOSS列表",notes = "老板列表")
    public PageInfo<TBoss> getAllByPage(){
        List<TBoss> tBossList = tBossService.getAll();
        return new PageInfo<TBoss>(tBossList);
    }*/

    @RequestMapping(value = "/addTBoss",method = {RequestMethod.POST})
    @ResponseBody
    public ResultInfo addTBoss(@RequestBody TBoss tBoss){
        tBossService.addTBoss(tBoss);
        return new ResultInfo(200,null,"SUCCESS");
    }

    @RequestMapping(value = "/tBossDetail/{id}",method = {RequestMethod.POST})
    @ResponseBody
    @ApiOperation(value = "使用PathVariable方式传值",notes = "@PathVariable")
    public ResultInfo getTBossDetail(@PathVariable Integer id){
        TBoss tBoss = tBossService.getTBossDetail(id);
        return new ResultInfo(200,tBoss,"SUCCESS");
    }

    @RequestMapping(value = "/tBossDetail2",method = {RequestMethod.POST})
    @ResponseBody
    @ApiOperation(value = "使用RequestParam方式传值",notes = "@RequestParam")
    public ResultInfo getTBossDetail2(@RequestParam Integer id){
        TBoss tBoss = tBossService.getTBossDetail(id);
        return new ResultInfo(200,tBoss,"SUCCESS");
    }

    @RequestMapping(value = "/tBossDetail3",method = {RequestMethod.POST})
    @ResponseBody
    @ApiOperation(value = "使用默认方式传值",notes = "default")
    public ResultInfo getTBossDetail3(Integer id){
        TBoss tBoss = tBossService.getTBossDetail(id);
        return new ResultInfo(200,tBoss,"SUCCESS");
    }


}
