package io.jboot.demo.schedule.distributed;

import io.jboot.schedule.annotation.Cron;
import io.jboot.schedule.annotation.EnableDistributedRunnable;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Title: 分布式任务
 * @Description: 每1分钟执行一次
 * @Package io.jboot.demo.schedule.distributed
 */
@Cron("*/1 * * * *")
@EnableDistributedRunnable
public class MyTask implements Runnable {

    @Override
    public void run() {
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(time);
    }
}
