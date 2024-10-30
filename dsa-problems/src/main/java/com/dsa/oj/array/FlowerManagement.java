package com.dsa.oj.array;

public class FlowerManagement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,0,0,0,0,0,1};
        int n = 5, q = 3;
        System.out.println(flower(n , q,  arr));
    }
    public static boolean flower(int n, int q, int[] arr){
        int i=0, cnt=0;
        while(i<n){
            if(
                arr[i]==0 &&
                arr[i-1] == 0 &&
                arr[i+1] ==0
            ){
                arr[i]=1;
                cnt++;
            }
            i++;
        }
        return cnt>=q;
    }
}
