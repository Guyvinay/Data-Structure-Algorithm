package com.dsa.oj.problems;

public class Sort012 {
    public static void main(String[] args) {
        int[] array = {2, 0, 1, 2, 1, 0, 2, 1, 0};

        System.out.println("Original Array:");
        printArray(array);

        sort012(array);

        System.out.println("\nArray after sorting 0s, 1s, and 2s:");
        printArray(array);
    }

    public static void sort012(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (array[mid]) {
                case 0:
                    swap(array, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(array, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
