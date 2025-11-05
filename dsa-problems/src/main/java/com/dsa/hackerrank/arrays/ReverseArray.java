package com.dsa.hackerrank.arrays;

import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while(left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(reverseArray(Arrays.asList(1, 2, 3, 4, 5)));
    }
}
