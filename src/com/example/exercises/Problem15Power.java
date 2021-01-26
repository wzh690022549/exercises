package com.example.exercises;

import java.util.Scanner;

/*
一直除以2
 */
public class Problem15Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int num = scanner.nextInt();
        int times = 1;
        boolean flag = true;
        if (num % 2 == 0) {
            for (int i = num / 2; i > 1; i /= 2) {
                if (i % 2 == 0){
                    times++;
                } else {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }
        if (flag){
            System.out.println(num + "是2的" + times + "次方");
        } else {
            System.out.println(num + "不是2的n次方");
        }
    }
}
