package com.dsa.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] ans = twoSum.twoSum(new int[]{1, 2, 3, 4, 5,}, 8);
        System.out.println(Arrays.toString(ans));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
