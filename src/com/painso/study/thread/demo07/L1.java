package com.painso.study.thread.demo07;

// 推导 Lambda 表达式
public class L1 {
    // 3. 静态内部类
    static class Like2 implements iLike {
        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }

    public static void main(String[] args) {
        iLike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();
        // 4. 局部内部类
        class Like3 implements iLike {
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }
        like = new Like3();
        like.lambda();
        // 5. 匿名内部类
        like = new iLike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };
        like.lambda();

        // 6. 用 Lambda 简化 jdk1.8
        like = () -> {
            System.out.println("i like lambda5");
        };
        like.lambda();
    }
}


// 1. 定义函数式接口
interface iLike {
    void lambda();
}

// 2. 实现类
class Like implements iLike {
    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}