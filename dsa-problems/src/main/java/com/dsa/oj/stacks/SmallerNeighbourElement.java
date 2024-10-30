package com.dsa.oj.stacks;

import java.util.Stack;

public class SmallerNeighbourElement {
    public String smallerNeighbourElement(int[] arr){

        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            while(!stk.isEmpty() && stk.peek()>=arr[i])stk.pop();
            if(stk.isEmpty())sb.append(-1+" ");
            else sb.append(stk.peek()+" ");
            stk.push(arr[i]);
        }

        return sb+"";

    }
    public static void main(String[] args) {
        SmallerNeighbourElement sm = new SmallerNeighbourElement();
        System.out.println(sm.smallerNeighbourElement(new int[]{9,8,6,7,3,4}));
    }
}
