package com.celeste.chapter02;

public class demo3 extends Thread{
    private Res res;

    public demo3(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "," + res.getNumber());
        }
    }

    public static void main(String[] args) {
        Res res = new Res();
        demo3 t1 = new demo3(res);
        demo3 t2 = new demo3(res);
        t1.start();
        t2.start();
    }
}

class Res {
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        protected Integer initialValue() {
            return 0;
        };
    };

    public Integer getNumber() {
        int count = threadLocal.get() + 1;
        threadLocal.set(count);
        return count;

    }

}

