package ExtProb;

import java.util.Scanner;

public class RemoveDuplicates {
       public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[]{1, 1, 2, 2, 2, 3, 4, 4, 5};
           removeDuplicates(arr);
           sc.close();
    }
    public static void removeDuplicates(int[] arr){
        int ind = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[ind]){
                ind++;
                arr[ind] = arr[i];
            }
        }
        for(int i=0; i<ind+1; i++)System.out.print(arr[i]+" ");
    }
}