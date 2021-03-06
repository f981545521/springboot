package cn.acyou.service;

import cn.acyou.pojo.Boss;
import cn.acyou.pojo.TBoss;

import java.util.List;

/**
 * @author youfang
 * @date 2017-12-05 14:20
 **/
public interface TBossService {

    List<TBoss> getAll();

    List<TBoss> getAllByExample(Integer age);

    void addTBoss(TBoss tBoss);

    TBoss getTBossDetail(Integer id);

    List<Boss> getAllBoss();
}
