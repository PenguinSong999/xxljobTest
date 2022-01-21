package com.xxl.job.executor.test;

public class TestThread extends Thread {

    @Override
    public void run() {
        System.out.println("当前线程:"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程体执行了，当前线程:"+Thread.currentThread().getName());
    }
}
