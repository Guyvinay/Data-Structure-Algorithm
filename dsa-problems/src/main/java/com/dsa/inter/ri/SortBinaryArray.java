package com.dsa.inter.ri;

import java.util.Arrays;

public class SortBinaryArray {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0};
        System.out.println(Arrays.toString((arr)));
        System.out.println(Arrays.toString(sortBinaryArray(arr)));
    }

    private static int[] sortBinaryArray(int[] arr) {

        int left=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        return arr;
    }
}
