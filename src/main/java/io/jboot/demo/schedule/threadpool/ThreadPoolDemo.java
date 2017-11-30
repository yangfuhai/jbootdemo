package io.jboot.demo.schedule.threadpool;

import io.jboot.Jboot;
import io.jboot.schedule.annotation.FixedDelay;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.schedule.cron4j
 */
@FixedDelay(period = 5, initialDelay = 5) //每5秒钟执行一次
public class ThreadPoolDemo implements Runnable {


    public static void main(String[] args) {

        Jboot.run(args);
    }

    @Override
    public void run() {
        System.out.println("ThreadPoolDemo run invoked!!!!");
    }
}
