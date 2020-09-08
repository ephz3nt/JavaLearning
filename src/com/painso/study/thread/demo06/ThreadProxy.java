package com.painso.study.thread.demo06;

public class ThreadProxy {
    public static void main(String[] args) {
        // 静态代理
        new WeddingCompany(new You()).Marry();
        // 类比实现了Runnable接口的对象
        new Thread(() -> System.out.println("aaa")).start();
    }
}

interface Marry {
    void Marry();
}

class You implements Marry {
    @Override
    public void Marry() {
        System.out.println("张三结婚了");
    }
}

class WeddingCompany implements Marry {
    private Marry role;

    public WeddingCompany(Marry role) {

        this.role = role;
    }

    private void before() {
        System.out.println("布置。。。。。。。");
    }

    private void after() {
        System.out.println("结帐。。。。。");
    }

    @Override
    public void Marry() {
        before();
        this.role.Marry();
        after();

    }
}