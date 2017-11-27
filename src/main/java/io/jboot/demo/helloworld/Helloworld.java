package io.jboot.demo.helloworld;

import io.jboot.Jboot;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.helloworld
 */
@RequestMapping("/")
public class Helloworld extends JbootController {


    public static void main(String[] args) {
        Jboot.run(args);
    }


    public void index() {
        renderText("hello world.");
    }

}
