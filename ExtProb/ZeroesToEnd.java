package ExtProb;
import java.util.*;
public class ZeroesToEnd {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[]{0,1,1,0,1,0,0,1,1};
           System.out.println(Arrays.toString(arr));
           System.out.println(Arrays.toString(zeroesToEnd(arr)));
           sc.close();
    }
    public static int[] zeroesToEnd(int[] arr){
        int l = 0, r = arr.length-1;
        while (l<r) {

            while (l<r && arr[l]!=0) {
                l++;
            }
            while (l<r && arr[r]==0) {
                r--;
            }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }
}

