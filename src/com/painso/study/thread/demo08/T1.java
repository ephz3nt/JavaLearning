package com.painso.study.thread.demo08;

public class T1 implements Runnable{
    // define flag
    private boolean flag = true;

    @Override
    public void run() {
        // use flag argument in loop conditions
        int sum = 0;
        while(flag) {
            System.out.println(Thread.currentThread().getName()+" running... times: "+sum);
            if (sum == 10){
                this.stop();
            }
            sum++;
        }
    }
    // define stop() change flag status
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        new Thread(new T1()).start();
        new Thread(new T1()).start();
    }
}

