package com.dsa.oj.problems;

class Solution {
         public int maxArea(int[] height) {
        int max = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int area = Math.min(height[i], height[j])*(j-i);
                max = Math.max(max , area);
            }
        }
        return max;
        // int l = 0,
        //     r = height.length-1,
        //     max = 0;
        //     while(l<r){
        //         int area = Math.min(height[l],height[r])*(r-l);
        //         max = Math.max(max , area);
        //         if(height[l]<height[r])l++;
        //         else r--;
        //     }
        //     return max;
        // System.out.println("Vinay is A Good Boy!");
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {21,3,8,9,4,5,7,8};
        System.out.println(sol.maxArea(arr));
    }
}