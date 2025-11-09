package com.dsa.practice.arrays;

import java.util.Arrays;

public class ArraysProblem {
    public static void main(String[] args) {
        int[] arr = {10, 0, 2, 8, 0, 3, 0, 7, 6, 0, 4, 5, 6};
//        reverse(arr);
//        System.out.println(secondLargest(arr));
        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));
    }

    private static int[] moveZeroesToEnd(int[] arr) {

        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) arr[ind++] = arr[i];
        }
        while (ind<arr.length) arr[ind++] = 0;
        return arr;
    }

    private static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                sec = first;
                first = num;
            } else if (num > sec && first > num) {
                sec = num;
            }
        }
        return sec;
    }

    public static void reverse(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}
