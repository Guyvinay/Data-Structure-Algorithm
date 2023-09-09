package LeetCodeProbs;

//  3-Sum
 //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.
/*
 * Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public  List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> list = new ArrayList<>();
     Arrays.sort(nums);
     for(int i=0; i<nums.length-2; i++){

        if(i>0 && nums[i]==nums[i-1])continue;  
        int j=i+1;
        int k = nums.length-1;
        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum == 0){
                List<Integer> li = Arrays.asList(nums[i],nums[j],nums[k]);
                list.add(li);
                while(j<k && nums[j]==nums[j+1])j++;
                while(j<k && nums[k]==nums[k-1])k--;
                j++;
                k--;
            }else if(sum<0)j++;
            else k--;
        }

     }

    return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,-1,-5,0,-2,3};
        Solution sol =new Solution();
        System.out.println(sol.threeSum(arr));
    }
}