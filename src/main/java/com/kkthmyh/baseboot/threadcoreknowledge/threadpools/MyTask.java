package com.kkthmyh.baseboot.threadcoreknowledge.threadpools;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author kkthmyh
 * @Date 2020/11/27 10:38
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
public class MyTask implements Runnable {

    private int num;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行任务" + num);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "task" + num + "执行完毕");
    }
}
