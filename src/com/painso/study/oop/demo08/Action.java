package com.painso.study.oop.demo08;

// abstract 抽象类
public abstract class Action {
    public Action(){
        System.out.println("abstract constructor");
    }
    {
        System.out.println("anonymous code block");
    }
    static {
        System.out.println("static anonymous code block");
    }
    // 抽象方法，定义约束/框架
    // 只有方法的名字，没有方法体
    public abstract void doSomething();
}
