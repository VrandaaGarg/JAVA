package Loop.forLoop;

import java.util.Scanner;

public class J07_OddNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = s.nextInt();
        for (int i = 1; i <= n; i = i + 2) {
            System.out.println(i);
        }
        s.close();
    }
}
