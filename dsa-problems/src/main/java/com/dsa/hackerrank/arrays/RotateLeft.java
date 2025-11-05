package com.dsa.hackerrank.arrays;

import java.util.Arrays;
import java.util.List;

public class RotateLeft {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        for(int i=0; i<d; i++) {
            arr = rotate(arr);
        }

        return arr;
    }

    public static List<Integer> rotate(List<Integer> list) {
        int t = list.get(0);
        for(int i=1; i<list.size(); i++) {
            list.set(i-1, list.get(i));
        }
        list.set(list.size()-1, t);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(rotateLeft(4, Arrays.asList(1, 2, 3, 4, 5)));
    }
}
