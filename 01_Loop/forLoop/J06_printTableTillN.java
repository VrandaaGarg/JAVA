
import java.util.*;

public class J06_printTableTillN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
        s.close();
    }
}
