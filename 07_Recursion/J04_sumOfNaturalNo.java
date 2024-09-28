
public class J04_sumOfNaturalNo {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1); // 4+sum(3) => 4+3+sum(2) => 4+3+2+sum(1) => 4+3+2+1+sum(0) => 4+3+2+1+0
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}
