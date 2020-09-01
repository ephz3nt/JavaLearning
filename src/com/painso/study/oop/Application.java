package com.painso.study.oop;

import com.painso.study.oop.demo04.Student;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.learn();
        s1.setName("张三");
        System.out.println(s1.getName());
        s1.setAge(999);
        System.out.println(s1.getAge());
    }
}
