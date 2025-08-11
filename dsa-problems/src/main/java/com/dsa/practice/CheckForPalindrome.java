package com.dsa.practice;

public class CheckForPalindrome {

    public static void main(String[] args) {
        String input = "racecar";

        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // minimize GC noise

        long startMem = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        boolean result = checkForPalindrome(input);

        long endTime = System.nanoTime();
        long endMem = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Result: " + result);
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
        System.out.println("Memory Used: " + (endMem - startMem) + " bytes");
    }


    public static boolean checkForPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char ch1 = str.charAt(left);
            char ch2 = str.charAt(right);
            if (ch1 != ch2) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
