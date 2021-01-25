package com.example.exercises;

import java.util.ArrayList;

public class Problem07Prime {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[501];
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(1);
        for (int i = 2; i < 501; i++) {
            if (!isPrime[i]) {
                primeList.add(i);
                for (int j = 2; i * j < 501; j++) {
                    isPrime[i * j] = true;  // 排除掉所有的合数
                }
            }
        }
        System.out.println(primeList);
    }
}
