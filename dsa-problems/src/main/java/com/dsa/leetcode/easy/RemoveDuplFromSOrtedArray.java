package com.dsa.leetcode.easy;

import java.util.Arrays;

public class RemoveDuplFromSOrtedArray {
    public int[] removeDuplFromSOrtedArray(int[] arr){

        int j = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        RemoveDuplFromSOrtedArray rdf = new RemoveDuplFromSOrtedArray();
        System.out.println(Arrays.toString(rdf.removeDuplFromSOrtedArray(new int[]{0,0,1,1,1,2,2,3,3,4})));
    }
}
