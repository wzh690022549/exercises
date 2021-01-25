package com.example.exercises;

import java.util.Scanner;

/*
一共9位数，定义一个字符串列表，在适当的地方加上亿、万，特殊考虑0的情况。
 */
public class Problem05AmountInWords {
    public static String[] wordOfNum = {"", "一", "二", "三", "四", "五", "六", "七", "八", "九"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numList = toList(num);
        String amountInWords = "";
        // 先处理第9位
        if (numList[0] != 0) {
            amountInWords = wordOfNum[numList[0]] + "亿";
        }
        // 处理5-8位
        amountInWords += thousands(numList[1], numList[2], numList[3], numList[4], amountInWords);
        if (!amountInWords.isEmpty()) {
            amountInWords += "万";
        }
        // 处理1-4位
        amountInWords += thousands(numList[5], numList[6], numList[7], numList[8], amountInWords);
        System.out.println(amountInWords);
    }

    // 把数字转换成9位的int数组，不满9位补0
    public static int[] toList(int num) {
        int[] list = new int[9];
        for (int i = list.length - 1; i >= 0; i--) {
            list[i] = num % 10;
            num /= 10;
            if (num == 0) {
                break;
            }
        }
        return list;
    }

    // 一个数字的1-4位与5-8位写法大致相同，可以使用同一个方法
    public static String thousands(int thousand, int hundred, int ten, int unit, String amountInWords) {
        // 如果四位数全为零，前面不空就加上零，前面空就返回空
        if (thousand == 0 && hundred == 0 && ten == 0 && unit == 0) {
            if (amountInWords.isEmpty()) {
                return "";
            } else {
                return "零";
            }
        }
        String str = "";
        // 千位
        if (thousand == 0) {
            if (!amountInWords.isEmpty()) {
                str += "零";
            }
        } else {
            str += wordOfNum[thousand] + "千";
        }
        // 百位若为零，先看千位是不是零，如果千位也是零，则什么也不加，否则加零
        if (hundred == 0) {
            if (thousand != 0 && !amountInWords.isEmpty()) {
                str += "零";
            }
        } else {
            str += wordOfNum[hundred] + "百";
        }
        // 与百位同理
        if (ten == 0) {
            if (hundred != 0 && !amountInWords.isEmpty()) {
                str += "零";
            }
        } else {
            str += wordOfNum[ten] + "十";
        }
        // 个位不需要加零
        if (unit != 0) {
            str += wordOfNum[unit];
        }
        return str;
    }
}
