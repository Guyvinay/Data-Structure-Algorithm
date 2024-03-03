package Placements_DSA_prob;

/**
 * MinMaxArray
 */
public class MinMaxArray {

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 12, 9, 6, 20};
        int min = arr[0];
        int max = arr[0];
        for(int e:arr){
            if(e<min)min=e;
            if(e>max)max=e;
        }
        System.out.println(max-min);
    }
}