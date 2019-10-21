package com.celeste.chapter03;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class demo2 {
    public static class Person{
        private int age;
        private int name;

        public Person(int age,int name){
            this.age = age;
            this.name = name;
        }

        public void setName(int name)
        {
            this.name = name;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public int getAge()
        {
            return age;
        }

        public int getName()
        {
            return name;
        }

        public String toString(){
            return "Person{" + "age=" +age+",name="+name+"}";
        }

    }
    public static void main(String[] args) {
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<Person> queue = new ArrayBlockingQueue<Person>(5);
        Person a = new Person(1,1);
        Person b = new Person(2,2);
        Person c = new Person(3,3);
        Person d = new Person(4,4);
        Person e = new Person(5,5);
        Person f = new Person(6,6);
        //添加元素
        queue.offer(a);
        queue.offer(b);
        queue.offer(c);
        queue.offer(d);
        queue.offer(e);
        for(Person q : queue){
            System.out.println(q);
        }
        if(queue.size() == 5) {
            queue.poll();
            queue.offer(f);
        }
        System.out.println("===");
        for(Person q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(Person q : queue){
            System.out.println(q);
        }

    }
}
