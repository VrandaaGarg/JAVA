import java.util.ArrayList;
import java.util.Comparator;

public class J02_SortingAL {
    public static void main(String[] args) {

        ArrayList<Integer> Num = new ArrayList<Integer>();

        Num.add(4);
        Num.add(2);
        Num.add(6);
        Num.add(3);

        System.out.println("Before Sorting: " + Num.toString());

        Num.sort(Comparator.naturalOrder()); // sort this arrayList in its natural order

        System.out.println("After Sorting: " + Num.toString());

        // reverse order

        Num.sort(Comparator.reverseOrder());

        System.out.println("reverse order: " + Num.toString());
    }
}
