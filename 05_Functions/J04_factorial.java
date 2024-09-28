import java.util.Scanner;

public class J04_factorial {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        int ans = factorial(n);
        System.out.printf("Fcatorial of %d is %d", n, ans);
        sc.close();
    }
}
