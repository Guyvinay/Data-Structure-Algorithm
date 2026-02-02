package com.dsa.neetocde;

import java.util.HashSet;
import java.util.Set;

public class HasDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 9};
        System.out.println(hasDuplicate(arr));
    }

    private static boolean hasDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int n: arr) {
            if(!set.add(n)) return true;
        }
        return false;
    }
}
