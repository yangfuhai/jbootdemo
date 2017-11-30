package io.jboot.demo.schedule.cron4j;

import io.jboot.Jboot;
import io.jboot.schedule.annotation.Cron;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jboot.demo.schedule.cron4j
 */
@Cron("*/1 * * * *") //每分钟执行一次 run()
public class Cron4jDemo implements Runnable {


    public static void main(String[] args) {

        Jboot.run(args);
    }

    @Override
    public void run() {
        System.out.println("Cron4jDemo run invoked!!!!");
    }
}
