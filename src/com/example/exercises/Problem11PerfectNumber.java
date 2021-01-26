package com.example.exercises;

import java.util.ArrayList;

/*
遍历（2 ~ n/2）把符合条件的因数求和。
 */
public class Problem11PerfectNumber {
    public static void main(String[] args) {
        ArrayList<Integer> perfectNumber = new ArrayList<>();
        int sum;
        for (int num = 2; num <= 10000; num++) {
            sum = 1;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                perfectNumber.add(num);
            }
        }
        System.out.println("10000以内的完全数有：");
        System.out.println(perfectNumber);
    }
}
