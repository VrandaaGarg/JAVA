
//import
import java.util.ArrayList;

public class J01_syntax {
    public static void main(String[] args) {
        // Sytax for creating an ArrayList
        ArrayList<Integer> number = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        number.add(1); // 0 index
        number.add(2); // 1 index
        number.add(3); // 2 index
        number.add(4); // 3 index
        number.add(5); // 4 index

        // Printing the ArrayList
        System.out.println(number.toString());

        // printing a particular element
        System.out.println(number.get(0)); // will print 1

        // Removing an element by index
        number.remove(2); // will remove 3

        // Printing the ArrayList after removal
        System.out.println(number.toString());

        // removing an element by value
        number.remove(Integer.valueOf(2)); // will remove 2 value

        // Clearing full arrayList
        // number.clear();

        // Updating elemeny in arrayList
        number.set(1, Integer.valueOf(4)); // 2-->4
        System.out.println(number.toString());
    }
}
