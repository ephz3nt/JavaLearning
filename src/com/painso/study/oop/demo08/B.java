package com.painso.study.oop.demo08;

public class B extends A {
    @Override
    public void goSomething() {
        System.out.println("go");
    }

    @Override
    public void doSomething() {
        System.out.println("do");
    }

    public static void main(String[] args) {
new B();
        System.out.println("**************");
new B();
    }

}
