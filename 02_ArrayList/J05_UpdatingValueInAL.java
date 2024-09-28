import java.util.ArrayList;

public class J05_UpdatingValueInAL {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            num.add(i);
        }

        System.out.println("Before updation: " + num.toString());

        // num.forEach(number -> {
        // num.set(num.indexOf(number), number * 2);
        // });

        // This will not work as expected as
        // When forEach reaches the second element (which is 2), num.indexOf(2) finds
        // the first occurrence of 2 (which is now the updated first element). So,
        // instead of updating the second element, it updates the first element again.

        for (int i = 0; i < num.size(); i++) {
            num.set(i, num.get(i) * 2);
        } // correct way to update the value

        System.out.println("After updation: " + num.toString());
    }
}
