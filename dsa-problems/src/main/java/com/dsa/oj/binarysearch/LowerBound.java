package com.dsa.oj.binarysearch;
import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int ans = lowerBound(num, k, arr);
        System.out.println(ans);
        sc.close();
    }
    public static int lowerBound(int num, int k, int[] arr){
        int i = 0, j = num-1, ans = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==k){
                ans = mid;
                j = mid-1;
            }
            else if(arr[mid]>k) j = mid - 1;
            else i = mid+1;
        }
        return ans;
    }   
}