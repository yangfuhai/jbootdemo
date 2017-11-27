package io.jboot.demo.aop;

import io.jboot.Jboot;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import javax.inject.Inject;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.aop
 */
@RequestMapping("/aop")
public class AopController extends JbootController {


    public static void main(String[] args) {
        Jboot.run(args);
    }

    @Inject
    private UserService userService;

    public void index() {
        System.out.println(userService);
        renderText("user id : " + userService.findUserById().getId());
    }
}
