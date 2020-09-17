package com.painso.study.thread.syn;

public class D1 {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();
        new Thread(station,"小明").start();
        new Thread(station,"小红").start();
        new Thread(station,"黄牛").start();
    }
}

class BuyTicket implements Runnable {
    // tickets
    private int ticketNums = 10;
    boolean flag = true; //外部停止方式
    @Override
    public void run() {
        // buy
        while(flag){
            // 模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buy();
        }
    }
    private synchronized void buy(){
        // 判断是否有票
        if (ticketNums <=0){
            flag=false;
            return;
        }

        // 买票
        System.out.println(Thread.currentThread().getName()+"拿到： "+ticketNums--);
    }
}
