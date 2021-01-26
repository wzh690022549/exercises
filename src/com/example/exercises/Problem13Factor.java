package com.example.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/*
递归找最小因数
 */
public class Problem13Factor {
    public static ArrayList<Integer> factor = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int num = scanner.nextInt();
        getFactor(num);
        // 按照指定格式打印输出
        System.out.print(num + "=");
        for (int i = 0; i < factor.size() - 1; i++) {
            System.out.print(factor.get(i) + "*");
        }
        System.out.println(factor.get(factor.size() - 1));
    }

    public static void getFactor(int num) {
        for (int i = 2; i <= num; i++) {    // 从2开始寻找最小因子
            if (num % i == 0) {
                factor.add(i);
                if (i != num) {
                    getFactor(num / i); // 递归调用
                }
                return;
            }
        }
    }
}
