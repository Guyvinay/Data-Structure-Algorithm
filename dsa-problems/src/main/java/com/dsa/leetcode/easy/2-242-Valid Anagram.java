package com.dsa.leetcode.easy;

class Solution1 {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = s.toCharArray();
        String s1 = new String(arr2);
        String s2 = new String(arr1);
        return s1.equals(s2);
    }
}