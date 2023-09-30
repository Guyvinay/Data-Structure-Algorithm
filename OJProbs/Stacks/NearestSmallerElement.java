package OJProbs.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {
    
    public static int[] nearestSmallerElement(int[] arr){

        int num = arr.length;
        int[] nextSmaller = new int[num];
        Stack<Integer> stk1 = new Stack<>();
        for(int i=0; i<num; i++){
            while(!stk1.isEmpty() && stk1.peek()<=arr[i])stk1.pop();
            if(stk1.isEmpty())nextSmaller[i]=-1;
            else nextSmaller[i]=stk1.peek();
            stk1.push(arr[i]);
        }
        

        int[] nextGreater = new int[num];
        Stack<Integer> stk2 = new Stack<>();
        for(int i=num-1; i>=0; i--){
            while(!stk2.isEmpty() && stk2.peek()>=arr[i])stk2.pop();
            if(stk2.isEmpty())nextGreater[i]=-1;
            else nextGreater[i]=stk2.peek();
            stk2.push(arr[i]);
        }
        return nextGreater;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nearestSmallerElement(new int[]{1,2,9,4,3,7,5})));
    }
}
