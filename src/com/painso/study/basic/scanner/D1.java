package com.painso.study.basic.scanner;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        // 创建一个扫描器对象， 接受键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用NEXT方法接受");

        // 判断用户是否输入数据
        if (scanner.hasNext()){
            // 使用next接受
            String str = scanner.next();
            System.out.println(str);
        }
        //  凡是属于IO流的类如果不执行关闭操作会一直占用资源
        scanner.close();
    }
}
