package io.jboot.demo.service;

import io.jboot.aop.annotation.Bean;
import io.jboot.db.model.JbootModel;
import io.jboot.demo.model.User;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;


@Singleton
@Bean
public class UserServiceImpl implements UserService {

    @Inject
    User dao;


    public JbootModel findById(Object id) {
        return dao.findById(id);
    }

    public boolean deleteById(Object id) {
        return dao.deleteById(id);
    }

    public List<User> findAll() {
        return dao.find("select * from user");
    }
}
