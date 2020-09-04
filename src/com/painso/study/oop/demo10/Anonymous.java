package com.painso.study.oop.demo10;

public class Anonymous {
    public static void main(String[] args) {
        new Eat().eat();
//        UserService userService = new UserService() {
//            @Override
//            public void run() {
//
//            }
//        };
        new UserService(){
            @Override
            public void run() {

            }
        };
    }
}
class Eat{
    public void eat(){
        System.out.println("eat");
    }
}

interface UserService{
    void run();
}