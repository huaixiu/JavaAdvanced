package com.celeste.chapter05;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo4 {

    public static void main(String[] args) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            newSingleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ",i:" + temp);
                }
            });
        }
    }

}
