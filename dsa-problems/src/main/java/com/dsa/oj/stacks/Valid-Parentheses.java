package com.dsa.oj.stacks;

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
    /*
     Stack<Character> stk = new Stack<>();
        for(int i=0; i<num; i++){
            char ch = str.charAt(i);
            if(ch=='{'||ch=='['||ch=='(') stk.push(ch);
            else{
                if(stk.size()==0)return 0;
                char top = stk.pop();
                if(top=='('&&ch!=')')return 0;
                if(top=='{'&&ch!='}')return 0;
                if(top=='['&&ch!=']')return 0;
            }
        }
        if(stk.size()==0)return 1;
        return 1;
    */
    }
    public static void main(String[] args) {
        Solution sol =new Solution();
        System.out.println(sol.isValid("[]()"));
    }
}