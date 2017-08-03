package io.jboot.demo;

import io.jboot.Jboot;
import io.jboot.event.JbootEvent;
import io.jboot.event.JbootEventListener;
import io.jboot.event.annotation.EventConfig;

/**
 * Created by michael on 2017/6/28.
 */
@EventConfig(action = Jboot.EVENT_STARTED)
public class MyListener implements JbootEventListener {
    @Override
    public void onEvent(JbootEvent event) {
        System.out.println("get event : " + event.getAction());
    }
}
