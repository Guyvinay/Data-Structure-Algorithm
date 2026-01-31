package com.dsa.leetcode.easy;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits2(38));
    }
    public static int addDigits(int num) {
        if(num == 9 || num == 0) return num;
        return num % 9;
    }
    public static int addDigits2(int num) {
        while (num >= 9) {
            num = sums(num);
        }
        return num;
    }

    private static int sums(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }
        return sum;
    }
}
