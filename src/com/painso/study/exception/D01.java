package com.painso.study.exception;

public class D01 {
    public static void main(String[] args) {
        int a =1;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
        System.out.println(a/b);
    }catch (Exception e){
        System.out.println("program running exception");
    }finally {
        System.out.println("finally");
    }
    }
}
