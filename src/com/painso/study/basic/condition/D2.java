package com.painso.study.basic.condition;

public class D2 {
    public static void main(String[] args) {
        /**
         * 打印一个三角形
         * 1. 把三角形拆分成左右两边
         * 2. 定义几个矩形框起来
         * 3. 打印左边空白区域
         * 4. 打印三角形左边
         */
        for (int i = 1; i <= 5; i++) {
            // 打印空白区
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            // 反向打印三角形左边
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 打印三角形右边
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
