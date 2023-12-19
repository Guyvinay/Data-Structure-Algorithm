package OJProbs.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StringsWithParenthesis {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
           System.out.println(stringsWithParenthesis(sc.next()));
           sc.close();
    }
    public static String stringsWithParenthesis(String str){
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='['||ch=='{')stk.push(ch);
            else{
                if(stk.isEmpty())return "balanced";
                char top = stk.pop();
                if(top=='{'&&ch!='}') return "unbalanced";
                if(top=='('&&ch!=')') return "unbalanced";
                if(top=='['&&ch!=']') return "unbalanced";
            }
        }
        if(stk.isEmpty())return "balanced";
        else return "unbalanced";
    }
}
