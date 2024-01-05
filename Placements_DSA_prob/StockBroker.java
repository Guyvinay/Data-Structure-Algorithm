package Placements_DSA_prob;

import java.util.Scanner;
public class StockBroker{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++){
            int num = sc.nextInt();
            int[] arr = new int[num];
            for(int a=0; a<num; a++){
                arr[a]=sc.nextInt();
            }
            int ans = stockBroker(num,arr);
            System.out.println(ans);
        }
        sc.close();
    }
    public static int stockBroker(int n, int[]arr){
        int curr = arr[0];
        int profit = 0;
        for(int i=0; i<n; i++){
            if(curr>arr[i]){
                curr = arr[i];
            }else{
                profit = Math.max(profit,arr[i]-curr);
            }
        }
        return profit;
    }
}
