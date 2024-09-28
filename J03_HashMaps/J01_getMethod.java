import java.util.HashMap;

public class J01_getMethod {
    public static void main(String[] args) {
        // Create a HashMap to store exam scores
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        // Adding values to the HashMap
        examScore.put("Math", 90);
        examScore.put("Science", 80);
        examScore.put("English", 70);
        examScore.put("History", 60);

        // Get the score for Math (which exists in the map)
        System.out.println("Math score: " + examScore.get("Math")); // 90

        // Attempt to get the score for Sanskrit (which does not exist in the map)
        System.out.println("Sanskrit score: " + examScore.get("Sanskrit")); // null

        // Using getOrDefault to return -1 if the key "Sanskrit" does not exist
        System.out.println("Sanskrit score (with default): " + examScore.getOrDefault("Sanskrit", -1)); // -1
    }
}
