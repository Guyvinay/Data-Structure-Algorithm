package OJProbs.Stacks;
import java.util.Stack;
public class UseSideLane {

    public boolean useSideLane(int[] arr){
        Stack<Integer> stk = new Stack<>();
        int temp = 1;
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==temp){
                temp++;
                continue;
            }
            else if(!stk.isEmpty() && stk.peek() == temp ){
                while(!stk.isEmpty() && stk.peek() == temp ){stk.pop();temp++;}
            }
            if(!stk.isEmpty() && stk.peek()<arr[i])flag=false;
            stk.push(arr[i]);
        }
        return flag;
    }


    public static void main(String[] args) {
        UseSideLane usl = new UseSideLane();
        System.out.println(usl.useSideLane(new int[]{1,3,5,2,4})); 
    }
}
