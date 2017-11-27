package io.jboot.demo.aop;

import io.jboot.aop.annotation.Bean;
import io.jboot.demo.common.User;

import javax.inject.Singleton;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.aop
 */
@Bean //设置为自动发现
@Singleton //设置为单例模式
public class UserServiceImpl implements UserService {

    @Override
    public User findUserById() {
        return new User("from UserServiceImpl");
    }
}
