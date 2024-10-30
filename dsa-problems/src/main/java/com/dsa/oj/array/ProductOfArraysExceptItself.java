package com.dsa.oj.array;

import java.util.Arrays;

public class ProductOfArraysExceptItself {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] ans = productOfArraysExceptItself(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] productOfArraysExceptItself(int[] arr) {
        int[] ans = new int[arr.length];
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int pr1 = 1, pr2 = 1;
        for(int i=0; i<arr.length; i++){
            left[i] = pr1;
            pr1*=arr[i];
        }
        for(int i=arr.length-1; i>=0; i--){
            right[i] = pr2;
            pr2 *= arr[i];
        }
        for(int i=0; i<arr.length; i++){
            ans[i] = left[i]*right[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return ans;
    }
}
