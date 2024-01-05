import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3};
            int j=0;
            for(int i=1; i<nums.length; i++){
                if(nums[i]!=nums[j]){
                    j++;
                    nums[j]=nums[i];
                }
            }
            

            System.out.println(Arrays.toString(nums));
    }
    
}
