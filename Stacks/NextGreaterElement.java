package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    public String nextGreaterElement(int[] arr){

        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[arr.length];
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek()<=arr[i])stk.pop();
            if(stk.isEmpty())ans[i]=-1;
            else ans[i]=stk.peek();
            stk.push(arr[i]);
        }
        for(int a : ans)sb.append(a+" ");
        return sb+"";

    }
    public static void main(String[] args) {
        NextGreaterElement sm = new NextGreaterElement();
        System.out.println(sm.nextGreaterElement(new int[]{9,8,6,7,3,4}));
    }
}


