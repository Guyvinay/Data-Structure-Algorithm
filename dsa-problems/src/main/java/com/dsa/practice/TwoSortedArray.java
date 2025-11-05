package com.dsa.practice;

public class TwoSortedArray {
    public static void main(String[] args) {

        int n = 6;
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {4, 4, 3, 2, 1, 1};
        int l = 0;
        int r = n-1;
        int  x = 0;
        while(l< arr1.length && r >=0) {
            if(arr1[l] == arr2[r]) {
                l++;
                r--;
                x++;
            } else if(arr1[l]>arr2[r]) r--;
            else l++;
        }
        System.out.println(x);
    }
}
