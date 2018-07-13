package com.example.hs.hsjydemo.thread.test;
class MyTest{
    Runnable run = () ->{

    };
}



public class InterTest {
    public static void main(String[] args) throws Exception{
        Thread thread = new Thread(() -> {
            System.out.println("72个小时我可以睡很长的时间");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("我已经睡好了可以出去祸害别人了");
            }
        });
        thread.start();
        if (!thread.isInterrupted()){
            Thread.sleep(100);
            thread.interrupt();
            System.out.println("你好我已经来打扰你了");
        }
    }
}
