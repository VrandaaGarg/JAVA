package Loop.forLoop;

import java.util.Scanner;

public class J04_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.printf("Factorial of %d is %d", n, fact);
        s.close();
    }
}
