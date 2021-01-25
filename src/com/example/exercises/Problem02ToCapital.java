package com.example.exercises;
/*
判断是小写字母之后转换成大写字母。
 */

import java.util.Scanner;

public class Problem02ToCapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.println((char) (c + ('A' - 'a')));
        } else {
            System.out.println(c + " 不是小写字母。");
        }
    }
}
