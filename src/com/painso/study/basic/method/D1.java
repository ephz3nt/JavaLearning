package com.painso.study.basic.method;

public class D1 {
    public static void main(String[] args) {
        D1 d1 = new D1();
        d1.test(1,2,3,4,5);
    }
    public void test(int... args){
        System.out.println(args[1]);
    }
}
