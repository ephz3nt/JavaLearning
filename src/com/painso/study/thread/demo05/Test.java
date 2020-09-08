package com.painso.study.thread.demo05;

public class Test {
    public int test(){
        int i = 9;
        if (i > 100){
            System.out.println("i<100");
            return 1;
        }{
            if (i<100){
                System.out.println("code block");
                return 2;
            }

        }
        return 3;
    }
    public static void main(String[] args) {
        System.out.println(new Test().test());
    }
}
