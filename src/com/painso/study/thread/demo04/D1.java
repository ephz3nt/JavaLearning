package com.painso.study.thread.demo04;

// 多个线程同时操作同一个对象
// 买火车票的例子
public class D1 implements Runnable {

    // 票数
    private int ticketNums = 10;

    @Override
    public void run() {

        while (true) {
            if (ticketNums <= 0) {
                break;
            }
            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNums-- + "张票");
//            ticketNums--;
        }
    }

    public static void main(String[] args) {
        D1 ticket = new D1();

        new Thread(ticket, "小麦").start();
        new Thread(ticket, "小红").start();
        new Thread(ticket, "小明").start();
    }
}
