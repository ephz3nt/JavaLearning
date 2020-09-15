package com.painso.study.thread.demo07;

public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("i'm lambda, Thread name: " + Thread.currentThread().getName()),"WeaponX").start();
    }
}
