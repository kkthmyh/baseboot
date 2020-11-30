package com.kkthmyh.baseboot.xianchenchi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author kkthmyh
 * @Date 2020/11/27 0:12
 * @Version 1.0
 * @Description
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            pool.execute(new Worker("任务".concat(String.valueOf(i))));
        }
        pool.shutdown();
        while (!pool.isTerminated()) {
        }
        System.out.println("所有任务结束");


    }
}
