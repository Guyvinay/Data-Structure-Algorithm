// package com.dsa.extrazz;

// import java.util.Scanner;
// public class RemoveDuplicates {
//        public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[]{1, 1, 2, 2, 2, 3, 4, 4, 5};
//            removeDuplicates(arr);
//            sc.close();
//     }
//     public static void removeDuplicates(int[] arr){
//         int ind = 0;
//         for(int i=1; i<arr.length; i++){
//             if(arr[i]!=arr[ind]){
//                 ind++;
//                 arr[ind] = arr[i];
//             }
//         }
//         for(int i=0; i<ind+1; i++)System.out.print(arr[i]+" ");
//     }
    
// }
package com.dsa.extrazz;

import java.util.Scanner;

/**
 * This class removes duplicates from a given array.
 */
public class RemoveDuplicates {
    /**
     * Main method to test the removeDuplicates method.
     * @param args Command line arguments.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 1, 2, 2, 2, 3, 4, 4, 5};
        System.out.println("Original array: ");
        printArray(arr);
        removeDuplicates(arr);
        System.out.println("Array after removing duplicates: ");
        printArray(arr, getUniqueCount(arr));
        sc.close();
    }

    /**
     * Removes duplicates from the given array.
     * @param arr The input array.
     */
    public static void removeDuplicates(int[] arr){
        int ind = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[ind]){
                ind++;
                arr[ind] = arr[i];
            }
        }
    }

    /**
     * Prints the array up to the given index.
     * @param arr The input array.
     * @param index The index up to which the array should be printed.
     */
    public static void printArray(int[] arr, int index){
        for(int i=0; i<index; i++)System.out.print(arr[i]+" ");
        System.out.println();
    }

    /**
     * Prints the entire array.
     * @param arr The input array.
     */
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++)System.out.print(arr[i]+" ");
        System.out.println();
    }

    /**
     * Returns the count of unique elements in the array.
     * @param arr The input array.
     * @return The count of unique elements.
     */
    public static int getUniqueCount(int[] arr){
        int ind = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[ind]){
                ind++;
            }
        }
        return ind + 1;
    }
}
