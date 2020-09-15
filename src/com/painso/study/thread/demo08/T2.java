package com.painso.study.thread.demo08;

public class T2 {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("////////");
        });
        // 观察线程状态
        // 创建线程未启动
        Thread.State state = thread.getState();
        System.out.println(state);

        // 启动后状态
        thread.start();
        state = thread.getState();
        System.out.println(state);

        // 循环监听线程状态
        while(state != Thread.State.TERMINATED){

            try{
                Thread.sleep(200);
            }catch(Exception e){
                e.printStackTrace();
            }
            // 更新线程状态
            state = thread.getState();
            System.out.println(thread.getState());
        }
    }
}
