import java.util.HashMap;

public class J05_forEachLoop {
    public static void main(String[] args) {
        // Create a HashMap to store exam scores
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        // Adding values to the HashMap
        examScore.put("Math", 90);
        examScore.put("Science", 80);
        examScore.put("English", 70);
        examScore.put("History", 60);

        // Iterate over the HashMap using forEach loop
        examScore.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
