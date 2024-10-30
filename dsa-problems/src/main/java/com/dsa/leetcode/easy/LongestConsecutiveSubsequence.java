package com.dsa.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{100,4,200,1,3,2};
        int ans = longestConsecutiveSubsequence(arr);
        System.out.println(ans);
    }
    private static int longestConsecutiveSubsequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int mx = 0;
        for(int i:arr)set.add(i);
        // System.out.println(set);
        for(int num : arr){
            if(!set.contains(num-1)){
                int curr = num;
                int pt = 1;
                while(set.contains(curr+1)){
                    curr++;
                    pt++;
                }
                // mx = Math.max(curr, mx);
                if(pt>mx)mx=pt;
            }
        }
        return mx;
    }
 }