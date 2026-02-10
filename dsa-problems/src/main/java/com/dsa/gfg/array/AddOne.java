package com.dsa.gfg.array;

import java.util.Arrays;

public class AddOne {
    public static void main(String[] args) {
        int arr[] = {9, 9, 9};
        System.out.println(Arrays.toString(addOne(arr)));
    }

    private static int[] addOne(int[] arr) {

        int carr = 1;
        for(int i= arr.length-1; i>=0; i--) {
            int sum = arr[i] + carr;
            arr[i] = sum % 10;
            carr = sum / 10;
        }

        if(carr > 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = carr;
            System.arraycopy(arr, 0, newArr, 1, arr.length - 1);
            return newArr;
        }

        return arr;
    }
}
