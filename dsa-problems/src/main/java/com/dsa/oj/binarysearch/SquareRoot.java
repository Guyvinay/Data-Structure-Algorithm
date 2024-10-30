package com.dsa.oj.binarysearch;

import java.util.*;
public class SquareRoot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++){
            int ans = squareR(sc.nextInt());
            System.out.println(ans);
        }
        sc.close();
    }
    public static int squareR(int num){
        if (num == 0 || num == 1) {
            return num;
        }
        int i = 1, j = num, ans = 0;
        while(i<=j){
            int mid = (i+j)/2;
            int sq = mid*mid;
            if(sq==num) return mid;
            else if(sq<num){
                ans = mid;
                i = mid+1;
            }
            else j = mid-1;
        }
        return ans;
    }
}