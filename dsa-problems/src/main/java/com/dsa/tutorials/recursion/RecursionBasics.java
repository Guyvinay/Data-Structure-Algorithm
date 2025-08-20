package com.dsa.tutorials.recursion;

import org.w3c.dom.stylesheets.LinkStyle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    // Rec - 4

    public static void reverseArray(int[] arr, int l, int r) {

        if(l >= r) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseArray(arr, l+1, r-1);
    }

    public static void reverseArrayWithSingleVariable(int[] arr, int l) {
        int r = arr.length - l -1;
        if(l >= r) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseArrayWithSingleVariable(arr, l+1);
    }

    public static boolean isPalindrome(int n, String str) {
        int r = str.length() - n - 1;
        char left = str.charAt(n);
        char right = str.charAt(r);

        if(n >= r) return true;

        if(left != right) return false;

        return isPalindrome(n + 1, str);
    }

    // Rec - 5

    public static int fibbonachiSequence(int n) {

        if(n <= 1) return n;

        return fibbonachiSequence(n - 1) + fibbonachiSequence(n - 2);
    }

    private static void generateSubSequences(int i, int[] arr, List<Integer> list) {
        if(i>=arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        generateSubSequences(i+1, arr, list);

        list.remove(list.size() - 1);
        generateSubSequences(i+1, arr, list);
    }

    private static void generateSubSequencesOfSumK(int i, int[] arr, List<Integer> list, int sum, int k) {
        if(i >= arr.length) {
            if(sum == k) System.out.println(list);
            return;
        }

        list.add(arr[i]);
        sum += arr[i];

        generateSubSequencesOfSumK(i+1, arr, list, sum, k);

        list.remove(list.size() - 1);
        sum-=arr[i];

        generateSubSequencesOfSumK(i+1, arr, list, sum, k);

    }

    private static boolean generateSubSequencesOfSumKOnlyFirst(int i, int[] arr, List<Integer> list, int sum, int k) {
        if(i >= arr.length) {
            if(sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[i]);
        sum += arr[i];

        if(generateSubSequencesOfSumKOnlyFirst(i+1, arr, list, sum, k)) return true;

        list.remove(list.size() - 1);
        sum-=arr[i];

        if(generateSubSequencesOfSumKOnlyFirst(i+1, arr, list, sum, k)) return true;

        return false;

    }

    private static int generateSubSequencesOfSumKReturnCountOnly(int i, int[] arr, int sum, int k) {
        if(i >= arr.length) {
            if(sum == k) {
//                System.out.println(list);
                return 1;
            };
            return 0;
        }

        sum += arr[i];

        int l = generateSubSequencesOfSumKReturnCountOnly(i+1, arr, sum, k);

        sum-=arr[i];

        int r = generateSubSequencesOfSumKReturnCountOnly(i+1, arr, sum, k);

        return l+ r;

    }

    private static void stringSubsequences(int i, String str, String current) {
        if(i >= str.length()) {
            System.out.println(current);
            return;
        }
        stringSubsequences(i+1, str, current + str.charAt(i));
        stringSubsequences(i+1, str, current );
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        stringSubsequences(0, "Vin", "");
//        System.out.println(generateSubSequencesOfSumKReturnCountOnly(0, arr, 0, 2));
//        generateSubSequencesOfSumKOnlyFirst(0, arr, new ArrayList<>(), 0, 2);
//        generateSubSequencesOfSumK(0, arr, new ArrayList<>(), 0, 2);
//        generateSubSequences(0, arr, new ArrayList<>());
//        System.out.println(fibbonachiSequence(10));

//        System.out.println(isPalindrome(0,"MADAM"));
//        int[] arr = {1, 2, 3, 4, 5 , 6};
//        reverseArrayWithSingleVariable(arr, 0);
//        reverseArray(arr, 0, arr.length - 1);
//        System.out.println(factorialFunctional(5));
//        factorialParametrized(5, 1);
//        System.out.println(printSumOfNFunctional(5));
//        printSumOfNParameterized(10, 0);
//        printOneToNBack(5, 5);
//        printNToOne(5, 5);
//        printOneToN(1, 5);
    }




}
