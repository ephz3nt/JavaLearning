package com.painso.study.oop;


import com.painso.study.oop.demo05.A;
import com.painso.study.oop.demo05.B;
import com.painso.study.oop.demo05.Student;

public class Application {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        // 父类的引用指向了子类
        B b = new A();
        b.test();

    }
}
