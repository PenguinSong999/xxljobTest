package com.xxl.job.executor.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketThread extends Thread {

    public TicketThread(String name) {
        super(name);
    }

    public TicketThread(){}

    private static int count = 100;

    private  final  static Object obj = new Object();

    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            if (count == 0){
                break;
            }
//            lock.lock();
            synchronized (obj) {
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在售卖:" + count);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                }
            }
//            lock.unlock();
        }
    }
}
