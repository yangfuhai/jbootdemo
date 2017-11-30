package io.jboot.demo.websocket;


import io.jboot.Jboot;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;


/**
 * @author 徐海峰 （xhf6731202@126.com）
 * @version V1.0
 * @Package io.jboot.demo.websocket
 */
@RequestMapping("/websocket")
public class JsrWebSocketController extends JbootController {


    public static void main(String[] args) {
        Jboot.setBootArg("jboot.server.websocketEnable", "true");
        Jboot.run(args);
    }

    public void index() {
        render("/websocket.html");
    }
}
