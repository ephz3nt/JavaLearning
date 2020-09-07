package com.painso.study.thread.demo01;


// create thread way 1: extend Thread class, override run() method, call start enable thread
public class D1 extends Thread{
    @Override
    public void run(){
        // run() body
        for (int i = 0; i<20;i++){
            System.out.println("i'm run() body "+i);
        }
    }
    public static void main(String[] args) {
        // main() body
        D1 d1 = new D1();
        d1.start();
        for (int i = 0; i < 20; i++){
            System.out.println("i'm main() body "+i);
        }
    }
}
