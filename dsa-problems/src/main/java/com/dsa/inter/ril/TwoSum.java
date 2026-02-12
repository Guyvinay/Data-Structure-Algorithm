package com.dsa.inter.ril;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 2, 6};
        System.out.println(Arrays.toString(twoSums(arr, 9)));
    }

    private static int[] twoSums(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            if(map.containsKey(k-arr[i])) {
                return new int[]{i, map.get(k-arr[i])};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}
