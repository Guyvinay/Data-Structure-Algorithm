package com.dsa.gfg.array;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9};
        System.out.println(thirdLargest(arr));
    }

    private static int thirdLargest(int[] arr) {
        int largest = -1;
        int second = -1;
        int third = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                third = second;
                second = largest;
                largest = arr[i];
            }

            if(arr[i] < largest && arr[i] > second) {
                third = second;
                second = arr[i];
            }

            if(arr[i] < second && arr[i] > third) {
                third = arr[i];
            }

        }
        return third;
    }
}
