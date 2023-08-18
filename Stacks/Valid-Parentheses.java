package Stacks;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
    Stack<Character> stk = new Stack<>();
    for(int i=0;i<s.length(); i++){
        char p = s.charAt(i);
        if(p=='(') stk.push(')');
        else if(p=='[')stk.push(']');
        else if(p=='{') stk.push('}');  
        else if( stk.isEmpty() || stk.pop() != p  ) return false;
    }
    return stk.isEmpty();
    }
    public static void main(String[] args) {
        Solution sol =new Solution();
        System.out.println(sol.isValid("[]()"));
    }
}