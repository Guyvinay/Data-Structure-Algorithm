package com.dsa.leetcode;

public class Main {


        //  28. Find the Index of the First Occurrence in a String
        public int strStr(String haystack, String needle) {
            int n = needle.length();
            int h = haystack.length();
            for(int i=0; i<=h-n; i++) {
                if(needle.equals(haystack.substring(i, i+n))) {
                    return i;
                }
            }
            return -1;
        }
}
