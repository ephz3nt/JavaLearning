package com.painso.study.oop.demo06;

public class Application {
    public static void main(String[] args) {
        // 一个对象的实际类型是确定的
//        new Person();
//        new Student();

        // 可以指向的引用类型就不确定了
        // 父类的引用指向子类
        Student s1 = new Student(); // s1能调用的方法都是Student自己的或者继承父类的
        Person s2 = new Student();  // s2 父类型可以指向子类，但不能调用子类独有的方法
        Object s3 = new Student();
        s1.run();
        s2.run(); // 子类重写了父类的方法，执行了子类的方法

        // 对象能执行哪些方法，主要看对象左边的类型，和右边关系不大！
        s1.eat();
        ((Student) s2).eat();
        Object o1;
        System.out.println(        s2 instanceof Student);

    }
}
