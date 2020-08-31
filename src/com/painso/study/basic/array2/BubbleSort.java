package com.painso.study.basic.array2;

import java.util.Arrays;

/**
 * @author ephz3nt
 * @version 1.0
 * @description 冒泡排序算法实现
 */
public class BubbleSort {

    // sort method
    public static int[] sort(int[] s){
        /* 一层for循环
           二层循环每次排序结束后的处理

         */
        for (int i = 0; i < s.length-1;i++){
            /*
            二层for循环
            实际进行排序算法的循环体
            一二层的条件s.length要-1 否则会触发二层循环下标越界
             */
            //
            for (int j = 0; j < s.length-1;j++ ){
                // 定义临时变量用作交换数组值的位置
                int tmp;
                // 判断如果当前值>后一位索引的值则互换位置
                if (s[j] > s[j+1]){
                    tmp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tmp;
                }else{
                    continue;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] s1 = {9,7,5,3,1,55,71,555,9879,11};
        int[] s2 = sort(s1);
        for (int i = 0; i < s2.length; i++) {
            System.out.printf("%d\t",s2[i]);
        }
        System.out.println();
        for (int i = 0; i < s1.length; i++) {
            System.out.printf("%d\t",s1[i]);
        }
        System.out.println();

        Arrays.sort(s1);
        for (int i = 0; i < s1.length; i++) {
            System.out.printf("%d\t",s1[i]);
        }

        int[] s =  {9,7,5,3,1};

    }

}
