import java.util.Scanner;

public class J02_sumOfDigitsOfNo {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit:");
        int n = sc.nextInt();
        int ans = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is " + ans);
    }
}

// Output:
// 123456
// 1+2+3+4+5+6 = 21