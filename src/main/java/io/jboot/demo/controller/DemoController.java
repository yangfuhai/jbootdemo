package io.jboot.demo.controller;


import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

@RequestMapping("/")
public class DemoController extends JbootController {


    public void index() {

//        SecurityManager

//        WebIniSecurityManagerFactory

        render("index.html");
    }


}
