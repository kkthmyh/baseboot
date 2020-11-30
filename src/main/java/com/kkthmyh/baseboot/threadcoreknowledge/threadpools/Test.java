package com.kkthmyh.baseboot.threadcoreknowledge.threadpools;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author kkthmyh
 * @Date 2020/11/27 10:43
 * @Version 1.0
 * @Description
 */
public class Test {

    public static void main(String[] args) {
//
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));
//
//        for (int i = 0; i < 15; i++) {
//
//            MyTask myTask = new MyTask(i);
//            executor.execute(myTask);
//            System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" +
//                    executor.getQueue().size() + "，已执行玩别的任务数目：" + executor.getCompletedTaskCount());
//
//
//        }
//        executor.shutdown();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("test");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
