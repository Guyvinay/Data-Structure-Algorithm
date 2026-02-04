package com.dsa.neetocde;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>(arr.length);

        for (int num : arr) {

            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}
