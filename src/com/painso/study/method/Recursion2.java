package com.painso.study.method;

public class Recursion2 {
    /* 阶乘
        2! = 2 * 1
        3! = 3 * 2 * 1
        5! = 5 * 4 * 3 * 2 * 1
     */
    public static void main(String[] args) {
        /*
            计算5的阶乘
            流程如下:
            main -> recursion(5) -> recursion(4) -> recursion(3) -> recursion(2) -> recursion(1)
            由于递归体if判断了参数为1直接返回
            所以最后的recursion(1)得到一个具体值 1 后开始回传
            recursion(1):1  返回给       recursion(2) == 2*1 == 2
            recursion(2):2  继续返回给    recursion(3) == 3*2 == 6
            recursion(3):6  继续返回给    recursion(4) == 4*6 == 24
            recursion(4):24 继续返回给    recursion(5) == 5*24 == 120
         */
        System.out.println(recursion(5));
    }

    // 使用递归计算阶乘
    public static int recursion(int n){
        if (n == 1){
            return n;
        }else{
            /*
               5的阶乘这里等于 return recursion(5); == 5 * 4 * 3 * 2 * 1
               因为我们在上面的if判断如果n==1直接返回从而跳出递归体
             */
            return n*recursion(n-1);
        }

    }
}
