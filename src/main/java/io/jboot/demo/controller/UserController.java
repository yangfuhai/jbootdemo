package io.jboot.demo.controller;


import com.jfinal.kit.LogKit;
import io.jboot.demo.model.Company;
import io.jboot.demo.model.User;
import io.jboot.demo.service.UserService;
import io.jboot.utils.StringUtils;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

@RequestMapping("/user")
public class UserController extends JbootController {

    @Inject
    UserService userService;

    static Company Dao = new Company();

    public void index() {
        LogKit.debug("--------userService:" + userService);
        List<User> users = userService.findAll();
        setAttr("users", users);
//        System.out.println(Arrays.toString(users.toArray()));


        Company company = new Company();
        company.setCid(StringUtils.uuid());
        company.setName("aabbcc");
        company.use("a1").save();

        render("/users.html");
    }

    public void edit() {

//        ShiroTag

    }

    public void info() {

    }


}
