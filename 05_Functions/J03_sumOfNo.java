import java.util.Scanner;

public class J03_sumOfNo {

    // Taking inputs in function and returning the sum
    static int Sum(int x, int y, int z) { // formal arguments x,y,z
        int d = x + y + z;
        return d;
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int ans = Sum(a, b, c); // actual argurments a,b,c
        System.out.printf("The sum of %d %d %d is %d", a, b, c, ans);
        sc.close();
    }
}
