import java.util.Scanner;

public class J01_tablePrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = s.nextInt();
        int i = 1;
        do {
            System.out.printf("%d * %d =%d\n", n, i, n * i);
            i++;
        } while (i <= 10);
        s.close();
    }
}
