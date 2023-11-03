package Mathematics;

public class WeightSum {
    public int weightSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++)sum+=(i+1)*arr[i];
        return sum;
    } 
    public static void main(String[] args) {
        WeightSum ws = new WeightSum();
        int ans = ws.weightSum(new int[]{1,2,3,4,5});
        System.out.println(ans);
    }
}
