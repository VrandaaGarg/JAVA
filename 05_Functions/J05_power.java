import java.util.Scanner;

public class J05_power {
    static int exp(int a, int b) {
        int d = (int) Math.pow(a, b); // coversion from double to int
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a and b (a^b):");
        a = sc.nextInt();
        b = sc.nextInt();

        int ans = exp(a, b);
        System.out.printf("Ans:%d", ans);
        sc.close();
    }
}

// other method is to run 'for loop' of a (b times)