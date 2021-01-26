package com.example.exercises;

import java.util.Random;

/*
生成随机数，递归调用函数得到最终结果。
 */
public class Problem10GuiguGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100000000);
        System.out.println(num + "进行鬼谷猜想运算的结果：");
        System.out.println(guiguGuess(num));
    }

    // 递归调用
    public static boolean guiguGuess(int num) {
        if (num == 1) {
            return true;
        }
        if (num % 2 == 0) {
            return guiguGuess(num / 2);
        } else {
            return guiguGuess(num * 3 + 1);
        }
    }
}
