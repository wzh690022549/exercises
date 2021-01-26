package com.example.exercises;

import java.util.Scanner;

public class Problem12Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }
        if (sum % 9 == 0) {
            System.out.println(num + "可以被9整除。");
        } else {
            System.out.println(num + "不可以被9整除。");
        }
    }
}
