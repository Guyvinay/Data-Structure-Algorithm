package com.dsa.oj.problems;

public class Fibbonachi {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci sequence
        generateFibonacci(n);

        System.out.println("Fibonacci Sequence of " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void generateFibonacci(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Sequence of " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
