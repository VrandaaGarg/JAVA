import java.util.HashMap;

public class J04_checkItem {
    public static void main(String[] args) {
        // Create a HashMap to store exam scores
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        // Adding values to the HashMap
        examScore.put("Math", 90);
        examScore.put("Science", 80);
        examScore.put("English", 70);
        examScore.put("History", 60);

        // Check if the key "Math" exists in the map
        System.out.println("Math exists: " + examScore.containsKey("Math")); // true

        // Check if the value 90 exists in the map
        System.out.println("90 exits " + examScore.containsValue(90));
    }
}
