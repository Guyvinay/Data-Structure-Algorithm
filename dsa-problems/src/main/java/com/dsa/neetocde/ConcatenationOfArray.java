package com.dsa.neetocde;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(concatenationOfArrayV2(arr)));
    }

    private static int[] concatenationOfArrayV2(int[] arr) {
        int[] nums = new int[2 * arr.length];
        for (int j=0; j<arr.length; j++) {
            nums[j] = nums[j + arr.length] = arr[j];
        }
        return nums;
    }
    private static int[] concatenationOfArray(int[] arr) {
        int[] nums = new int[2 * arr.length];
        int index = 0;
        for (int i=0; i<2; i++) {
            for (int j=0; j<arr.length; j++) {
                nums[index++] = arr[j];
            }
        }
        return nums;
    }

}
