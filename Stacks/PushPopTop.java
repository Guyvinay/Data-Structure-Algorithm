package Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

public class PushPopTop {
    public void pushPopTop(List<List<String>> list){
        Stack<String> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).get(0).equals("1"))stk.push(list.get(i).get(1));
            else if(!stk.isEmpty()&&list.get(i).get(0).equals("2"))stk.pop();
            else if(list.get(i).get(0).equals("3")){
                if(stk.isEmpty())System.out.println("Empty!");
                else {
                    for(String s : stk)sb.append(s);
                    System.out.println(sb);
                }
            }
        }
    }
    public static void main(String[] args) {
        PushPopTop pushPopTop =new PushPopTop();
        pushPopTop.pushPopTop(Arrays.asList(Arrays.asList("1" ,"15") ,Arrays.asList("1" ,"20") , Arrays.asList("2"), Arrays.asList("3") , Arrays.asList("2") , Arrays.asList("3") ));
    }
}
