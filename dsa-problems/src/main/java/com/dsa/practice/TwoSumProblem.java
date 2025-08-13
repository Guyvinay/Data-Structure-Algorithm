package com.dsa.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 14;
        System.out.println(Arrays.toString(twoSum(arr, k)));
    }

    private static int[] twoSum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++) {
            int diff = k - arr[i];
            if(map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            }
            map.put(arr[i], i);
        }
        return new int[2];
    }
}
