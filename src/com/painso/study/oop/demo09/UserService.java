package com.painso.study.oop.demo09;

// interface 定义接口
public interface UserService {
    public static final int age = 99 ;
    // 返回值 方法名 (参数) 定义需要实现的方法
    void create(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
