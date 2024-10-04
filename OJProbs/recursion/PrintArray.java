public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        printArray(0 , array);

    }

    public static void printArray(int index,int[] arr){
        if(index==arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(index+1, arr);
      }
}