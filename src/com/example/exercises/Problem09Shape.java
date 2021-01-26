package com.example.exercises;

public class Problem09Shape {
    public static void main(String[] args) {
        System.out.println("等边三角形：");
        printEquilateralTriangle(5);

        System.out.println("直角三角形：");
        printRightTriangle(5);

        System.out.println("长方形：");
        printRectangle(10, 3);

        System.out.println("菱形：");
        printRhombus(5);

        System.out.println("空心等边三角形：");
        printHollowEquilateralTriangle(5);

        System.out.println("空心直角三角形：");
        printHollowRightTriangle(5);

        System.out.println("空心长方形：");
        printHollowRectangle(10,5);

        System.out.println("空心菱形：");
        printHollowRhombus(5);
    }

    // 等边三角形：空白递减，#递增
    public static void printEquilateralTriangle(int line) {
        for (int i = (line - 1), j = 1; i >= 0; i--, j += 2) {
            for (int blank = 0; blank < i; blank++) {
                System.out.print(" ");
            }
            for (int hash = 0; hash < j; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // 直角三角形：#递增
    public static void printRightTriangle(int line) {
        for (int i = 1; i <= line; i++) {
            for (int hash = 0; hash < i; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // 长方形：根据长宽循环
    public static void printRectangle(int length, int width) {
        while (width-- > 0) {
            for (int hash = 0; hash < length; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // 菱形：等边三角形加上倒置的等边三角形
    public static void printRhombus(int line) {
        printEquilateralTriangle(line);
        for (int i = 1, j = (line * 2 - 3); j > 0; i++, j -= 2) {
            for (int blank = 0; blank < i; blank++) {
                System.out.print(" ");
            }
            for (int hash = 0; hash < j; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // 空心等边三角形：在等边三角形的基础上判断是不是边界，是边界就输出#，否则输出空格
    public static void printHollowEquilateralTriangle(int line) {
        for (int i = (line - 1), j = 1; i >= 0; i--, j += 2) {
            for (int blank = 0; blank < i; blank++) {
                System.out.print(" ");
            }
            for (int hash = 0; hash < j; hash++) {
                if (hash == 0 || hash == j - 1 || i == 0) { // 判断是否是边界
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 空心直角三角形：
    public static void printHollowRightTriangle(int line) {
        for (int i = 1; i <= line; i++) {
            for (int hash = 0; hash < i; hash++) {
                if (hash == 0 || hash == i - 1 || i == line) { // 判断是否是边界
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 空心长方形：
    public static void printHollowRectangle(int length, int width) {
        for (int i = 0; i < width; i++) {
            for (int hash = 0; hash < length; hash++) {
                if (i == 0 || i == width - 1 || hash == 0 || hash == length - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 空心菱形：
    public static void printHollowRhombus(int line) {
        for (int i = (line - 1), j = 1; i >= 0; i--, j += 2) {
            for (int blank = 0; blank < i; blank++) {
                System.out.print(" ");
            }
            for (int hash = 0; hash < j; hash++) {
                if (hash == 0 || hash == j - 1) { // 判断是否是边界
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1, j = (line * 2 - 3); j > 0; i++, j -= 2) {
            for (int blank = 0; blank < i; blank++) {
                System.out.print(" ");
            }
            for (int hash = 0; hash < j; hash++) {
                if (hash == 0 || hash == j - 1) { // 判断是否是边界
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
