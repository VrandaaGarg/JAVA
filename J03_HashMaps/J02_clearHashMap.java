import java.util.HashMap;

public class J02_clearHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store exam scores
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        // Adding values to the HashMap
        examScore.put("Math", 90);
        examScore.put("Science", 80);
        examScore.put("English", 70);
        examScore.put("History", 60);

        System.out.println("Before clearing: " + examScore.toString());

        System.out.println(examScore.size());
        // Clear the HashMap
        examScore.clear();

        System.out.println("After clearing: " + examScore.toString());

        System.out.println(examScore.size());
    }
}
