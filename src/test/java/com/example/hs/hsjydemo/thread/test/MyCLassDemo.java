package com.example.hs.hsjydemo.thread.test;

class MyThread implements Runnable{
    private int tixket = 5;
    @Override
    public void run() {
       for (int i = 0; i < 100; i++){
           System.out.println("当前剩余票数+"+this.tixket);
       }
    }
}

/**
 *
 */

public class MyCLassDemo {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        new Thread(m).start();
        new Thread(m).start();
        new Thread(m).start();
        new Thread(m).start();
    }
}
