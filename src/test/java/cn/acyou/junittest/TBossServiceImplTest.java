package cn.acyou.junittest;

import cn.Application;
import cn.acyou.pojo.TBoss;
import cn.acyou.service.TBossService;
import cn.mybatispagehelper.mapper.CountryMapper;
import cn.mybatispagehelper.model.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author youfang
 * @date 2017-12-05 16:37
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Import(Application.class)
public class TBossServiceImplTest {

    @Resource
    private TBossService tBossService;

    @Resource
    private CountryMapper countryMapper;

    @Test
    public void test1(){
        List<TBoss> tBossList = tBossService.getAll();
        //MyBatis查出来的结果不可能为null
        System.out.println(tBossList.size());
        for(TBoss tBoss : tBossList){
            System.out.println(tBoss);
        }
    }
    @Test
    public void test1_1(){
        TBoss tBoss = tBossService.getTBossDetail(2);
        //MyBatis查出来的对象可能为空
        if("谁说的".equals(tBoss.getName())){
            System.out.println(tBoss);
        }
    }

    @Test
    public void test1_3(){
        TBoss tBoss = tBossService.getTBossDetail(2);
        //MyBatis查出来的对象可能为空
        if("谁说的".equals(tBoss.getName())){
            System.out.println(tBoss);
        }
    }
    @Test
    public void test1_2(){
        System.out.println("".equals(null));
    }


    @Test
    public void test2(){
        List<TBoss> tBossList = tBossService.getAllByExample(22);
        for(TBoss tBoss : tBossList){
            System.out.println(tBoss);
        }
    }

    @Test
    public void test3(){
        List<Country> countries = countryMapper.selectAll();
        System.out.println(countries);
    }

}
