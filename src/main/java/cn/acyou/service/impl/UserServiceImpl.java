package cn.acyou.service.impl;

import cn.acyou.entity.User;
import cn.acyou.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author youfang
 * @create 2017-12-03 21:58
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Override
    public User getUser() {
        return new User("校长",23,new Date());
    }


}
