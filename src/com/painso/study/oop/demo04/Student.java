package com.painso.study.oop.demo04;

public class Student {
    // name
    private String name;
    // id
    private int id;
    // sex
    private String sex;
    // age
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // learn()
    public void learn(){

    }

    // sleep()
    public void sleep(){

    }

    // getter
    public String getName(){
        return this.name;
    }
    // setter
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
