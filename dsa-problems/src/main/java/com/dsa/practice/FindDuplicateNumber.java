package com.dsa.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 1, 1};
        System.out.println(Arrays.toString(findDuplicate(arr)));
    }
    public static int[] findDuplicate(int[] nums) {

        int[] dupArr = new int[nums.length];

        for (int i=0; i<dupArr.length; i++) {
            dupArr[nums[i]]++;
        }
//        System.out.println(Arrays.toString(dupArr));

        return dupArr;
    }

}
