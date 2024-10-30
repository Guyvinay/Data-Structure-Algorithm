package com.dsa.oj.problems;

import java.util.Arrays;

public class ZeroesOnes {
    public static void main(String[] args) {
        
        int[] array = {0, 1, 1, 0, 1, 0};
        int l=0, r=array.length-1;
        while (l<r) {
            if(array[l]==0&&l<r)l++;
            while (array[r]==1&&l<r)r--;
            int t = array[l];
            array[l] = array[r];
            array[r] = t;
        }
        System.out.println(Arrays.toString(array));
    }
}
