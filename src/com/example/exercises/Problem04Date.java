package com.example.exercises;

import java.util.Scanner;

/*
年y  月m  日d
1:d
2:m1 + d
3:m1 + m2 + d
......

判断闰年，选择月份

 */
public class Problem04Date {
    public static final int[] DAYS_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        // 用本月的天数加上之前月份的总天数就是今年的天数
        int days = d;
        for (int i = 0; i < (m - 1); i++) {
            if (i == 1 && isLeapYear(y)){ //判断如果是闰年就在2月份多加一天
                days++;
            }
            days += DAYS_OF_MONTH[i];
        }
        System.out.println(y + "年" + m + "月" + d + "日是该年的第" + days + "天。");
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }
}
