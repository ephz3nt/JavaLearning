package com.painso.study.oop.demo05;

// student is a person  派生类/子类
// 子类继承了父类就会有父类的全部方法
public class Student extends Person {
//    Person person;
    private String name = "Student";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void test2(){
        super.say2();
    }
    public Student(){
        super();
        System.out.println("Student Construct");
    //  super();
    }
}
