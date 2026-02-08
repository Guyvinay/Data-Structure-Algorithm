package com.dsa.gfg.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,4,6,7,9};
        System.out.println(Arrays.toString(reverseArrayHalf(arr)));
    }

    private static int[] reverseArrayTwoPointer(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
        return arr;
    }

    private static int[] reverseArrayHalf(int[] arr) {
        for (int i=0; i< arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;

        }
        return arr;
    }
}
