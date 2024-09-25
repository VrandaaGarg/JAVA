import java.util.ArrayList;

public class J03_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println();

        // Size method name.size()
        System.out.println(num.size()); // 5

        // Contain method name.contain(reference type value)
        System.out.println(num.contains(Integer.valueOf(3))); // true
        System.out.println(num.contains(Integer.valueOf(6))); // false
    }
}
