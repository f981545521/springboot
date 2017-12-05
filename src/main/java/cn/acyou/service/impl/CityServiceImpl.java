package cn.acyou.service.impl;

import cn.acyou.dao.CityDao;
import cn.acyou.domain.City;
import cn.acyou.mapper.TBossMapper;
import cn.acyou.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * Created by xchunzhao on 02/05/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Autowired
    private TBossMapper tBossMapper;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
