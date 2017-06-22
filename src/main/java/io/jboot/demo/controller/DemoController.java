package io.jboot.demo.controller;


import io.jboot.demo.model.User;
import io.jboot.demo.service.UserServiceImpl;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

@RequestMapping("/")
public class DemoController extends JbootController {

    @Inject
    UserServiceImpl userService;

    public void index() {

        render("index.html");
    }

    public void users() {

        List<User> users = userService.findAll();

        setAttr("users", users);
    }
}
