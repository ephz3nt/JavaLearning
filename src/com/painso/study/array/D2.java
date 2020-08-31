package com.painso.study.array;

public class D2 {
    public static void main(String[] args) {
        // 创建一个2维数组  11*11 0： 没有棋子 1：黑棋  2： 白棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
//        System.out.println(array1);
        for (int[] i : array1){
            for (int x : i){
                System.out.printf("%d\t",x);
            }
            System.out.println();
        }
    }
}
