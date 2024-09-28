import java.util.ArrayList;

public class J04_frEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        // num.add(1);
        // num.add(2);
        // num.add(3);
        // num.add(4);
        // num.add(5);

        for (int i = 1; i <= 5; i++) {
            num.add(i);
        }

        num.forEach(number -> {
            System.out.println(number * 2);
        });

        System.out.println(num.toString());
    }
}
