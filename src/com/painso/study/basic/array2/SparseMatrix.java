package com.painso.study.basic.array2;

/**
 * @author ephz3nt
 * @version 1.0
 * @description Sparse Matrix
 */
public class SparseMatrix {
    /**
     * 稀疏矩阵，在数值分析中，是其元素大部分为零的矩阵。
     * 反之，如果大部分元素都非零，则这个矩阵是稠密的。
     * 在科学与工程领域中求解线性模型时经常出现大型的稀疏矩阵。
     * 在使用计算机存储和操作稀疏矩阵时，经常需要修改标准算法以利用矩阵的稀疏结构。
     * 由于其自身的稀疏特性，通过压缩可以大大节省稀疏矩阵的内存代价。
     * 稀疏矩阵包含 行,列,值 固定三列
     *         0	0	0	0	0
     *         0	0	1	0	0
     *         0	0	0	2	0
     *         0	0	0	0	0
     *         0	0	0	0	0
     * 其中第一行为矩阵参数信息 包含 X行,Y列,Z个值
     * 如上矩阵 包含 5行,5列,2个值
     * 用稀疏矩阵表示为
     *         5    6   2   参数信息: 5行 5列 2个值
     *         1    2   1   1行2列值为1
     *         2    3   2   2行3列值为2
     */
    // 定义 压缩方法
    public static int[][] zip(int[][] s){
        // 定义稀疏矩阵数组行变量，需遍历原数组
        int sparseLine = 0;
        // 获取原数组中值的个数，定义稀疏数组前置需求
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (s[i][j] != 0){
                    sparseLine++;
                }
            }
        }
        // 获取到值个数sparseLine，定义稀疏矩阵数组
        // 因第一行需额外记录矩阵参数信息需要+1，列为固定3列
        int[][] sparseMatrix = new int[sparseLine+1][3];

        // 定义x存储行信息，定义y存储总共多少值用于求列，定义valueSum值总量
        int x=0;
        int y =0;
        int valueSum = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (s[i][j] !=0){
                    valueSum++;
                    // 设置 有效值的x，y轴坐标及值
                    sparseMatrix[valueSum][0] = i;
                    sparseMatrix[valueSum][1] = j;
                    sparseMatrix[valueSum][2] = s[i][j];
                }
                y++;
            }
            x++;
        }
        // 定义稀疏数组参数 行的值
        sparseMatrix[0][0] = x;
        // 定义稀疏数组参数 列的值
        sparseMatrix[0][1] = y/x;
        // 定义稀疏数组参数 值总量
        sparseMatrix[0][2] = valueSum;
        // 输出并返回压缩后的稀疏矩阵
//        for (int i = 0; i < sparseMatrix.length; i++) {
//            for (int j = 0; j < sparseMatrix[i].length; j++) {
//                System.out.print(sparseMatrix[i][j]+"\t");
//            }
//            System.out.println();
//        }
        return sparseMatrix;
    }
    // 定义解压缩稀疏矩阵方法
    public static int[][] unzip(int[][] s){
        // 定义解压缩数组参数信息
        // 这里看着方括号很多 其实 s[0][0] 和 s[0][1] 为稀疏数组元信息的 行与列的值
        int[][] unCompressMatrix = new int[s[0][0]][s[0][1]];

        // 遍历还原值坐标 这里行从1开始因为第0行是稀疏数组元信息
        for (int i = 1; i < s.length; i++) {
            int x=0;
            int y=0;
            int value=0;
            // 取 x,y坐标轴 s[i][0], s[i][1] 的值 s[i][2] 赋给unCompressMatrix
            unCompressMatrix[s[i][0]][s[i][1]] = s[i][2];
        }
            return unCompressMatrix;
    }
    public static void main(String[] args) {
        /*
        定义一个  5*5 的矩阵
        其中有两个值 1,2
        坐标分别为
        1： 第一行第二列
        2： 第二行第三列
        0	0	0	0	0
        0	0	1	0	0
        0	0	0	2	0
        0	0	0	0	0
        0	0	0	0	0
         */
        int[][] s1 = new int[5][6];
        s1[1][2] = 1;
        s1[2][3] = 2;
        System.out.println("输出原数组");
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length; j++) {
                System.out.print(s1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("==========================");
        int[][] zipArray = zip(s1);
        System.out.println("压缩原数组");
        for (int i = 0; i < zipArray.length; i++) {
            for (int j = 0; j < zipArray[i].length; j++) {
                System.out.print(zipArray[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("解压缩稀疏矩阵");
        System.out.println("==========================");
        int[][]  unCompressMatrix=unzip(zipArray);
        for (int i = 0; i < unCompressMatrix.length; i++) {
            for (int j = 0; j < unCompressMatrix[i].length; j++) {
                System.out.print(unCompressMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
