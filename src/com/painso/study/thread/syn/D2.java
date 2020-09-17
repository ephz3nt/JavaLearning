package com.painso.study.thread.syn;

// 死锁： 多个线程互相抱着对方需要的资源，然后形成僵持
public class D2 {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "小红");
        Makeup g2 = new Makeup(2, "小丽");
        g1.start();
        g2.start();
    }
}


// Lipstick
class Lipstick {

}

// Mirror
class Mirror {

}

class Makeup extends Thread {
    // 需要的资源只有一份，用static来保证
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();
    int choice;
    String girlName;

    Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        makeup();
    }

    private void makeup() {
        if (choice == 0) {
            synchronized (lipstick) {
                System.out.println(this.girlName + "拿到了口红锁");
                System.out.println("等待一秒");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (mirror) {
                    System.out.println(this.girlName + "拿到了镜子锁");
                }
            }

        } else {
            synchronized (mirror) {
                System.out.println(this.girlName + "拿到了镜子锁");
                System.out.println("等待两秒");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lipstick) {
                    System.out.println(this.girlName + "拿到了口红锁");
                }
            }

        }
    }
}
