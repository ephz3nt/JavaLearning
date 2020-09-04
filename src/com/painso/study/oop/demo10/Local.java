package com.painso.study.oop.demo10;

public class Local {
    public void method(){
        // 局部内部类 local inner class
        class Inner{
            // 定义局部内部类方法
            public void localMethod(){
                System.out.println("i'm local inner class");
            }
        }
        // 实例化
        Inner inner = new Inner();
        inner.localMethod();
    }
    public static void main(String[] args) {
        Local local = new Local();
        local.method();
    }
}
