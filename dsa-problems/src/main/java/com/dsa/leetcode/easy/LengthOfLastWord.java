package com.dsa.leetcode.easy;

/**
 * 58. Length of Last Word
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}