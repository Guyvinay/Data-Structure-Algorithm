package com.dsa.practice;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 3, 0, 1, 0, 3};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    private static int[] moveZeros(int[] arr) {
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        };
        while(index<arr.length) {
            arr[index] = 0;
            index++;
        }
        return arr;
    }
}
