package com.example.exercises;

import java.util.Scanner;

/*
任意两边之和大于第三边。
 */
public class Problem03Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入三条边长：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(a + ", " + b + ", " + c + " 符合三角形的边长。");
        } else {
            System.out.println(a + ", " + b + ", " + c + " 不符合三角形的边长。");
        }
    }
}
