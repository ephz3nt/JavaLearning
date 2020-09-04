package com.painso.study.oop.demo07;
import static java.lang.Math.random;

public class Person {
    public Person(){
        System.out.println("构造器代码块");
    }
    static {
        System.out.println("静态匿名代码块");
    }
    {
        System.out.println("匿名代码块");
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("**********************");
        Person p2 = new Person();
        System.out.println(Math.random());
        System.out.println(random());
    }
}
