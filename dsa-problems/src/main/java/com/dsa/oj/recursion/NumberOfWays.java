package com.dsa.oj.recursion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfWays {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            int ans = numberOfWays(num);
            List<Integer> list =  new ArrayList<>();
            numberOfWaysV2(num, list);
            System.out.println(ans);
        }
    }

    public static int numberOfWays(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return numberOfWays(n - 1) + numberOfWays(n - 2) + numberOfWays(n - 3);
        }
    }

    public static int numberOfWaysV2(int n, List<Integer> list) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return numberOfWays(n - 1) + numberOfWays(n - 2) + numberOfWays(n - 3);
        }
    }
}