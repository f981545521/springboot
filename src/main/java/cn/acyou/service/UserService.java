package cn.acyou.service;

import cn.acyou.entity.User;
import cn.acyou.pojo.TEmp;
import org.springframework.stereotype.Service;

/**
 * @author youfang
 * @create 2017-12-03 21:55
 */
public interface UserService {

    User getUser();

    TEmp getTempList(Integer id);
}
