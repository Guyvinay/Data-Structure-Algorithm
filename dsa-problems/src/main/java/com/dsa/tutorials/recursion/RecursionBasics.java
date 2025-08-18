package com.dsa.tutorials.recursion;

public class RecursionBasics {

    public static void func() {
        System.out.println("func called");
        func();
    }
    // Re 1
    /**
     *
     * Recursion: Recursion is when a function calls itself directly or indirectly until it reaches a stopping condition (base case).
     * Stack Space / Stack Overflow: Every recursive call is stored in the call stack (a memory structure that keeps track of function calls).
     * In recursion, each call waits for the next call to finish before popping.

     * Call Stack / Stack Overflow
     *
     * Recursion Tree
     factorial(3)
     = 3 * factorial(2)
     = 3 * (2 * factorial(1))
     = 3 * (2 * (1))
     = 6

     | factorial(1) |
     | factorial(2) |
     | factorial(3) |   <-- top of stack
     */
    // Re 1

    public static void printOneToN(int start, int end) {
        if(start == end) return;
        System.out.println("start " + start + ", end: " + end);
        printOneToN(start+1, end);
    }

    public static void printNToOne(int n, int m) {
        if(n < 1) return;
        System.out.println("n " + n + ", m: " + m);
        printNToOne(n - 1, m);
    }

    public static void printOneToNBack(int n, int m) {
        if(n < 1) return;
        printOneToNBack(n - 1, m);
        System.out.println("n " + n + ", m: " + m);
    }

    // Re-3

    /**

     Parameterized recursion: Passing parameters along the recursive call to carry results.
            Instead of returning results, we pass them as arguments.
     Functional Recursion:Function returns the result instead of passing as a parameter.
            Each call computes and returns to the previous one.
     */

    public static void printSumOfNParameterized(int n, int sum) {

        if(n<=0) {
            System.out.println("sum: " + sum);
            return;
        }
        printSumOfNParameterized(n-1, sum + n);
    }

    public static int printSumOfNFunctional(int n) {
        if(n<=1) {
            return 1;
        }
        return n + printSumOfNFunctional(n-1);
    }

    public static void factorialParametrized(int num, int fact) {
        if(num == 0) {
            System.out.println(fact);
            return;
        }
        factorialParametrized(num - 1, fact * num);
    }

    public static int factorialFunctional(int num) {
        if(num == 1) {
            return 1;
        }
        return num * factorialFunctional(num - 1);
    }

    public static void main(String[] args) {
//        printOneToN(1, 5);
//        printNToOne(5, 5);
//        printOneToNBack(5, 5);
//        printSumOfNParameterized(10, 0);
//        System.out.println(printSumOfNFunctional(5));
//        factorialParametrized(5, 1);
//        System.out.println(factorialFunctional(5));
    }




}
