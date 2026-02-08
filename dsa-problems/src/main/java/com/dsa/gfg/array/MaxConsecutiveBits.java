package com.dsa.gfg.array;


public class MaxConsecutiveBits {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(maxConsecBitwise(arr));
    }

    private static int maxConsecBits(int[] arr) {

        int count= 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                count++;
            } else {
                count = 1;
            }
        }

        return count;
    }

    private static int maxConsecBitwise(int[] arr) {

        int count= 1;
        for(int i=1; i<arr.length; i++) {
            if((arr[i] ^ arr[i-1]) == 0) {
                count++;
            } else {
                count = 1;
            }
        }

        return count;
    }
}
