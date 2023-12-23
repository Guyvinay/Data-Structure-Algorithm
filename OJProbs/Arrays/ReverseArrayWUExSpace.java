package OJProbs.Arrays;
import java.util.*;
class ReverseArrayWUExSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++)arr[i]=sc.nextInt();
        int l = 0, r = num-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for(int a : arr)System.out.print(a+" ");
        sc.close();
    }
}