package com.dsa.gfg.array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 0, 8, 6};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }

    private static int[] moveZerosToEnd(int[] arr) {
        int pt = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                arr[pt++] = arr[i];
            }
        }
        while (pt < arr.length) {
            arr[pt++] = 0;
        }
        return arr;
    }

    private static int[] moveZerosToEndB(int[] arr) {
        int[] ar = new int[arr.length];
        int pt = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]!=0) {
                ar[pt++] = arr[i];
            }
        }
        return ar;
    }
}
