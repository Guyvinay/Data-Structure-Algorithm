package com.dsa.practice.arrays;

public class ArraysProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 7, 6, 4, 5, 6};
//        reverse(arr);
        System.out.println(secondLargest(arr));
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
