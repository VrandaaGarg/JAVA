
import java.util.Scanner;

public class J01_factorial {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * (fact(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter a number:");

        n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }
}
