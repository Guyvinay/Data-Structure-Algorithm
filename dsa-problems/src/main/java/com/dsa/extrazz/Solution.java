package com.dsa.extrazz;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr);
    }

    /**
     * Prints the elements of the given array.
     *
     * @param arr the array to be printed
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}