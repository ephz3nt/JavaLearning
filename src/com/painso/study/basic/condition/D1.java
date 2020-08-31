package com.painso.study.basic.condition;

/**
 * @author ephz3nt
 * @version 1.0
 *
 * @description 使用for实现99乘法表
 * 1x1=1
 * 1x2=2 2x2=4
 * 1x3=3 2x3=6 3x3=9
 * 1x4=4 2x4=8 3x4=12 4x4=16
 * 1x5=5 2x5=10 3x5=15 4x5=20 5x5=25
 * 1x6=6 2x6=12 3x6=18 4x6=24 5x6=30 6x6=36
 * 1x7=7 2x7=14 3x7=21 4x7=28 5x7=35 6x7=42 7x7=49
 * 1x8=8 2x8=16 3x8=24 4x8=32 5x8=40 6x8=48 7x8=56 8x8=64
 * 1x9=9 2x9=18 3x9=27 4x9=36 5x9=45 6x9=54 7x9=63 8x9=72 9x9=81
 */
public class D1 {
    public static void main(String[] args) {
        for(int x =1;x<=9;x++){ // 定义x 为被乘的数，不超过9
            for(int y =1;y<=x;y++){ // 定义y为乘数，循环乘到不满足<=x退出
                System.out.printf("%dx%d=%d\t",y,x,y*x); // 使用格式化输出 "乘数x被乘数=积" , 不换行
            }
            System.out.println(); // 嵌套for执行结束后输出换行
        }
    }
}
