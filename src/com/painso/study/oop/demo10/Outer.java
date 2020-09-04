package com.painso.study.oop.demo10;

public class Outer {
    private static int id = 99;
    private void out(){
        System.out.println("outer class method");
    }
    // 定义内部类
    public class Inner{ // 定义内部类
        // 定义内部类方法
        public void in(){
            System.out.println("inner class method");
        }
        // 获取外部类私有属性
        public void getID(){
            System.out.println(id);
        }
        public void getMethod(){
            out();
        }
    }
    public static void main(String[] args) {
        // 实例化外部类
        Outer outer = new Outer();
        outer.out();
        // 实例化内部类方法1
        Outer.Inner inner1 = outer.new Inner();
        inner1.in();
        // 实例化内部类方法2
        Outer.Inner inner2 = new Outer().new Inner();
        inner2.in();
        inner2.getID();
        inner2.getMethod();
    }
}