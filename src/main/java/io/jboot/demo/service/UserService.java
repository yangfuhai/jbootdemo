package io.jboot.demo.service;

import io.jboot.db.model.JbootModel;
import io.jboot.demo.model.User;

import java.util.List;

/**
 * Created by michael on 2017/6/22.
 */
public interface UserService {

    public JbootModel findById(Object id);

    public boolean deleteById(Object id);

    public List<User> findAll();
}
