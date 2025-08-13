package com.dsa.practice;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, -8};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr = nums[0];
        for(int i=1; i<nums.length; i++) {
            curr = Math.max(nums[i], nums[i] + curr);
            max = Math.max(curr, max);
        }
        return max;
    }
}
