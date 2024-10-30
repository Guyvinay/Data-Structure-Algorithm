package com.dsa.extrazz;

import java.util.*;
public class ZeroesToEnd {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    //    int[] arr = new int[]{0,1,1,0,1,0,0,1,1};
       int[] arr = new int[]{1, 1, 2, 2, 2, 3, 4, 4, 5};
        //    System.out.println(Arrays.toString(arr));
        //    System.out.println(Arrays.toString(zeroesToEnd(arr)));
           removeDuplicates(arr);
           sc.close();
    }
    public static void removeDuplicates(int[] arr){
        int ind = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[ind]){
                ind++;
                arr[ind] = arr[i];
            }
        }
        for(int i=0; i<ind+1; i++)System.out.print(arr[i]+" ");
    }
    public static int[] zeroesToEnd(int[] arr){
        int l = 0, r = arr.length-1;
        while (l<r) {

            while (l<r && arr[l]!=0) {
                l++;
            }
            while (l<r && arr[r]==0) {
                r--;
            }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }
}

