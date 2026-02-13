package com.dsa.inte.ri;

public class XorMaxRemoval {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,5,7};
        process(arr);
    }

    private static void process(int[] arr) {
        int totalXor = 0;
        int n = arr.length;
        boolean[] isRemoved = new boolean[n];

        for (int num: arr) {
            totalXor ^= num;
        }

        for (int i=0; i<n; i++) {

            int maxVal = Integer.MIN_VALUE;
            int index = 0;
            for (int j=0; j<n; j++) {
                if (!isRemoved[j]) {
                    int candidate = totalXor ^ arr[j];
                    if (candidate > maxVal) {
                        maxVal = candidate;
                        index = j;
                    }
                }
            }
            System.out.println(arr[index]);
            isRemoved[index] = true;
            totalXor ^= arr[index];
        }
    }
}

