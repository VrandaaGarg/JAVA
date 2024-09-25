package Loop.forLoop;

import java.util.Scanner;

public class J05_printTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
        s.close();
    }
}
