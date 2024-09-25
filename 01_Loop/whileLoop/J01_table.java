import java.util.Scanner;

public class J01_table {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = s.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d * %d =%d\n", n, i, n * i);
            i++;
        }
        s.close();
    }
}
