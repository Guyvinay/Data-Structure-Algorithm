package OJProbs.Stacks;

import java.util.Stack;

public class ReducedString {

    public String reduceString(String str){
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(!stk.isEmpty() && stk.peek() == str.charAt(i) )stk.pop();
            else stk.push(str.charAt(i));
        }
        if(stk.isEmpty())return "Empty!";
        for(char c : stk)sb.append(c);
        return sb+"";
    }
    public static void main(String[] args) {
        ReducedString rds = new ReducedString();
        String ans = rds.reduceString("aaabccddd");
                System.out.println(ans);
    }
}
