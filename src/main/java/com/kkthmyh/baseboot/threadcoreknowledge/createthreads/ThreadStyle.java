package com.kkthmyh.baseboot.threadcoreknowledge.createthreads;

/**
 * @Author kkthmyh
 * @Date 2020/11/25 23:18
 * @Version 1.0
 * @Description
 */
public class ThreadStyle extends Thread{

    public static void main(String[] args) {
       new ThreadStyle().start();
    }

    @Override
    public void run() {
        System.out.println("开启Thread线程");
    }
}
