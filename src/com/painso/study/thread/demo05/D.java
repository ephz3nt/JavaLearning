package com.painso.study.thread.demo05;

// 模拟龟兔赛跑
public class D implements Runnable {

    // 胜利者 胜利者只有一个这里用 static 关键字
    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            String role = Thread.currentThread().getName();
            // 判断比赛是否结束
            boolean flag = isGameOver(i);
            // 如果比赛结束则停止程序
            if (flag) {
                break;
            }
            // 模拟兔子休息
            if (role.equals("Rabbit") && i % 10 == 0) {
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //  模拟乌龟速度
            if (role == "Tortoise") {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(role + "离终点还有" + (100 - i) + "米");
        }
    }

    // 判断比赛是否完成
    private boolean isGameOver(int steps) {
        // 判断是否有胜利者
        if (winner != null) {
            return true;
        }
        // 判断是否有角色到达终点
        if (steps >= 100) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        D race = new D();
        new Thread(race, "Rabbit").start();
        new Thread(race, "Tortoise").start();
    }
}
