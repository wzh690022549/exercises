package com.example.exercises;

/*
cock + hen + chick * 3 = 100;
5 * cock + 3 * hen + chick = 100;
三个未知数，两个方程，解方程。
 */
public class Problem08Chicken {
    public static void main(String[] args) {
        for (int cock = 0; cock < 20; cock++) {  //一百钱最多买20只公鸡
            for (int hen = 0; hen < 33; hen++) {     //一百钱最多买33只母鸡
                for (int chick = 0; chick < 33; chick++) {
                    if (cock + hen + chick * 3 == 100 && 5 * cock + 3 * hen + chick == 100) {
                        System.out.println("公鸡：" + cock + "    母鸡：" + hen + "    小鸡：" + chick * 3);
                    }
                }
            }
        }
    }
}
