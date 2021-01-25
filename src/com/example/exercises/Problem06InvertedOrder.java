package com.example.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/*
考虑使用ArrayList
 */
public class Problem06InvertedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // 倒序转换成ArrayList
        ArrayList<Integer> numList = new ArrayList<>();
        while (num != 0) {
            numList.add(num % 10);
            num /= 10;
        }
        // 遍历输出并且避免开头是0
        boolean isHead = true;
        for (Integer integer : numList) {
            if (!(integer == 0 && isHead)) {
                System.out.print(integer);
                isHead = false;
            }
        }
    }
}
