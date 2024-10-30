package com.dsa.leetcode.easy;

public class FindPivot {
    public static void main(String[] args) {
        int pivot = pivotIndex(new int[]{1,7,3,6,6,5});
        System.out.println(pivot);

        //Optimized
        int pivotPt = pivotPointIndex(new int[]{1,7,3,6,6,5});
        System.out.println(pivotPt);
    }
        private static int pivotPointIndex(int[] arr) {
            int sum=0;
            int left = 0;
            for(int i:arr)sum+=i;
            for(int i=0; i<arr.length; i++){
                sum-=arr[i];
                if(left==sum)return i;
                left+=arr[i];
            }
        return -1;
    }
        public static int pivotIndex(int[] nums) {
            for(int i=0; i<nums.length; i++){
                int lSum = arraySum(0,i,nums);
                int rSum = arraySum(i+1,nums.length,nums);
                // System.out.println(lSum+" "+rSum);
                if(lSum==rSum)return i;
            }
            return -1;
        }
        public static int arraySum(int l, int r, int[] nums){
            int sum = 0;
            for(int i=l; i<r; i++){
                sum+=nums[i];
            }
            return sum;
        }
        
    
 }