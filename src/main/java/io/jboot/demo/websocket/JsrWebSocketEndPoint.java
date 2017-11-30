package io.jboot.demo.websocket;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * @author 徐海峰 （xhf6731202@126.com）
 * @version V1.0
 * @Package io.jboot.demo.websocket
 */
@ServerEndpoint("/ws/test")
public class JsrWebSocketEndPoint {

    @OnMessage
    public void message(String message, Session session) {
        for (Session s : session.getOpenSessions()) {
            s.getAsyncRemote().sendText(message);
        }
    }
}
