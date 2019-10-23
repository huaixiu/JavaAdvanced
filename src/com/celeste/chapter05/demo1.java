package com.celeste.chapter05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo1 {

    public static void main(String[] args) {
        //可以缓存的线程池
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int temp=i;
            newCachedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    System.out.println(Thread.currentThread().getId()+",i"+temp);
                }
            });
        }

    }

}
