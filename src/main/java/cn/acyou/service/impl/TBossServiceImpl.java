package cn.acyou.service.impl;

import cn.acyou.mapper.BossMapper;
import cn.acyou.mapper.TBossMapper;
import cn.acyou.pojo.Boss;
import cn.acyou.pojo.TBoss;
import cn.acyou.pojo.TBossExample;
import cn.acyou.service.TBossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author youfang
 * @date 2017-12-05 14:21
 **/
@Service("tBossService")
public class TBossServiceImpl implements TBossService {

    @Autowired
    private TBossMapper tBossMapper;

    @Autowired
    private BossMapper bossMapper;

    @Override
    public List<TBoss> getAll() {
        return tBossMapper.getAll();
    }

    @Override
    public List<TBoss> getAllByExample(Integer age) {
        TBossExample tBossExample = new TBossExample();
        tBossExample.createCriteria().andAgeEqualTo(age);
        return tBossMapper.selectByExample(tBossExample);
    }

    @Override
    public void addTBoss(TBoss tBoss) {
        tBossMapper.insert(tBoss);
    }

    @Override
    public TBoss getTBossDetail(Integer id) {
        TBoss tBoss = tBossMapper.selectByPrimaryKey(id);
        return tBoss;
    }

    @Override
    public List<Boss> getAllBoss() {
        return bossMapper.selectAll();
    }
}
