package com.dsa.oj.stacks;

import java.util.Stack;

public class ValidStackSequence{

    public boolean validStackSequence(int[] arr1 , int[] arr2){
        int cnt=0;
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr1.length; i++){

            
            while(!stk.isEmpty() && cnt < arr1.length && stk.peek() == arr2[cnt] ){
                stk.pop();
                cnt++;
            }stk.push(arr1[i]);
        }
        return cnt==arr2.length?true:false; 
    }

    public static void main(String[] args) {
        ValidStackSequence vss = new ValidStackSequence();
        System.out.println(vss.validStackSequence(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
    }
}