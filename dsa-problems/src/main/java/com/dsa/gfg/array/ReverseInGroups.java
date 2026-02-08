package com.dsa.gfg.array;

import java.util.Arrays;

public class ReverseInGroups {
    public static void main(String[] args) {

        int[] arr = {1,2,4,6,7,9};
        System.out.println(Arrays.toString(reverseInGroups(arr, 3)));
    }

    private static int[] reverseInGroups(int[] arr, int k) {
        for(int i=0; i<arr.length; i+=k) {
            int left = i;
            int right = i + k - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
