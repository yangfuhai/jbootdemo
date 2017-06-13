package io.jboot.demo.service;

import io.jboot.db.model.JbootModel;
import io.jboot.demo.model.User;
import io.jboot.service.JbootService;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

/**
 * Created by michael on 2017/6/13.
 */
@Singleton
public class UserService extends JbootService {

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
