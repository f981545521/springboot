package cn.acyou.junittest;

import cn.acyou.Application;
import cn.acyou.pojo.TBoss;
import cn.acyou.service.TBossService;
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

    @Test
    public void test1(){
        List<TBoss> tBossList = tBossService.getAll();
        for(TBoss tBoss : tBossList){
            System.out.println(tBoss);
        }
    }


}
