package com.celeste.chapter01;

// 1.实现runable接口，重写run方法
public class demo2 {
    public static void main(String[] args) {
        System.out.println("main... 主线程开始...");

        // 创建线程
        ThreadDemo02 threadDemo02 = new ThreadDemo02();
        Thread t1= new Thread(threadDemo02);
        // 启动线程
        t1.start();
        for (int i = 0; i <100; i++) {
            System.out.println("main..i:"+i);
        }
        System.out.println("main... 主线程结束...");
    }
}

class ThreadDemo02 implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(" 子 i:" + i);
        }
    }
}

