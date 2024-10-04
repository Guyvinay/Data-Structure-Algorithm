import java.util.Scanner;

public class NumberOfWays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ans = numberOfWays(num);
        System.out.println(ans);
    }

    public static int numberOfWays(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return numberOfWays(n - 1) + numberOfWays(n - 2) + numberOfWays(n - 3);
        }
    }
}