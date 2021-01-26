package com.example.exercises;

import java.util.Scanner;

public class Problem14Equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入两个字符串：");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.equals(str2)) {
            System.out.println("两个字符串一致。");
        } else {
            System.out.println("两个字符串不一致。");
        }
    }
}
