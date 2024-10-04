import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ans = factorial(num);
        System.out.println(ans);
        scanner.close();
    }
    public static int factorial(int num) {
        if(num==1) return num;
        return num*factorial(num-1);
    }
}
