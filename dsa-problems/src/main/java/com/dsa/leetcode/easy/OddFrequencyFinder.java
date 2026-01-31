package com.dsa.leetcode.easy;

public class OddFrequencyFinder {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(findOddFrequency(arr)); // Output: 2
    }

    private static int findOddFrequency(int[] arr) {

        int result = 0;
        for (int ele: arr){
            System.out.println("result: " + result + ", ele: " + ele);
            result = result ^ ele;
            System.out.println("result: " + result );
        }
        return result;
    }
}
