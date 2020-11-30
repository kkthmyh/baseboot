package com.kkthmyh.baseboot.threadcoreknowledge.createthreads;

/**
 * @Author kkthmyh
 * @Date 2020/11/25 23:15
 * @Version 1.0
 * @Description
 */
public class RunnableStyle implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("开启一个Runnable线程");
    }
}
