package com.kkthmyh.baseboot.xianchenchi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.TimeUnit;

/**
 * @Author kkthmyh
 * @Date 2020/11/27 0:11
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
public class Worker implements Runnable {

    private String name;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行任务"+name);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"结束执行任务"+name);
    }
}
