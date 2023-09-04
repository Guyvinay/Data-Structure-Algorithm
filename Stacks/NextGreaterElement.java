package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] arr){

        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[arr.length];
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek()<=arr[i])stk.pop();
            if(stk.isEmpty())ans[i]=-1;
            else ans[i]=stk.peek();
            stk.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        NextGreaterElement sm = new NextGreaterElement();
        System.out.println(Arrays.toString(sm.nextGreaterElement(new int[]{9,8,6,7,3,4})));
    }
}


