package com.painso.study.thread.demo03;

// create thread way 2: implement Runnable interface, override run() method, call Thread(p).start()
public class D implements Runnable {

    @Override
    public void run() {
        System.out.println("i'm a thread implement Runnable interface");
    }

    public static void main(String[] args) {
        // create Runnable interface implement Object
        D d = new D();
        // create thread Object
        Thread thread = new Thread(d); // agent
        thread.start();
    }
}
