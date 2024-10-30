package com.dsa.leetcode.easy;


class Solution {
    public int[] getConcatenation(int[] nums) {
        // int[] arr = new int[2*nums.length];
        // int j=0;
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = nums[j];
        //     j++;
        //     if(j>=nums.length)j=0;
        // }
        // return arr;
        int[] arr = new int[2*nums.length];
        int a=0;
        for(int i=0; i<2; i++){
            for(int j=0; j<nums.length; j++){
                arr[a++] = nums[j];
            }
        }
        return arr;
    }
}