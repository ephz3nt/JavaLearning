package com.painso.study.oop.demo05;

// 父类
public class Person {
    protected String name = "Person";
    // public
    // protected
    // default
    // private
    private int money = 10_0000_0000;
//    private int money = 10_0000_0000;
    public void say(){
        System.out.println("say...");
    }
    protected void say2(){
        System.out.println("say...");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person() {
        System.out.println("Person Construct");
    }
}
