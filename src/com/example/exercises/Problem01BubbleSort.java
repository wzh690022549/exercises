package com.example.exercises;
/*
长度为n，共要排n-1趟，第i趟比较n-i次。
 */
public class Problem01BubbleSort {
    public static void main(String[] args) {
        int[] array = {100, 20, 50, 32, 78, 12, 64};
        for (int i = 0; i < array.length - 1; i++) {    //外层n-1
            for (int j = 0; j < array.length - 1 - i; j++){     //内层n-（i+1）
                if (array[j] > array[j + 1]){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        for (int j : array) {
            System.out.println(j);
        }
    }
}
