import java.util.HashMap;

public class J03_removeItem {
    public static void main(String[] args) {
        // Create a HashMap to store exam scores
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        // Adding values to the HashMap
        examScore.put("Math", 90);
        examScore.put("Science", 80);
        examScore.put("English", 70);
        examScore.put("History", 60);

        System.out.println("Before removing: " + examScore.toString());

        // Remove the key "Math" from the HashMap
        examScore.remove("Math");

        System.out.println("After removing: " + examScore.toString());
    }
}
