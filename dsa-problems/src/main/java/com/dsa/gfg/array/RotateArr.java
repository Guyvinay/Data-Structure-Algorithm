package com.dsa.gfg.array;

import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9};
        rotateArr2(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] rotateArr(int[] arr, int k) {
        for (int i=0; i<k; i++) {
            for (int j=0; j<arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = arr[0];
        }
        return arr;
    }

    private static void rotateArr2(int[] arr, int k) {

        rotate(arr, 0, k-1);
            rotate(arr, k, arr.length - 1);
        rotate(arr, 0, arr.length - 1);


    }
    private static void rotate(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }




}
