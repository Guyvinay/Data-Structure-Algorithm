package com.dsa.gfg;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9};
        System.out.println(getSecondLargest(arr));
    }

    private static int getSecondLargest(int[] arr) {
        int largest = -1;
        int second = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }

            if(arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }
}
