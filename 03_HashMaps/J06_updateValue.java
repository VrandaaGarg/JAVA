import java.util.HashMap;

public class J06_updateValue {
    public static void main(String[] args) {
        // Create a HashMap to store exam scores
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        // Adding values to the HashMap
        examScore.put("Math", 90);
        examScore.put("Science", 80);
        examScore.put("English", 70);
        examScore.put("History", 60);

        System.out.println("Before updating: " + examScore.toString());
        // want to minus 10 from each subject
        examScore.forEach((key, value) -> {
            examScore.replace(key, value - 10);
        });

        System.out.println("ater updating01: " + examScore.toString());
        // Update the value of the key "Math" to 95
        // examScore.put("Math", 95);
        examScore.replace("Math", 95);

        System.out.println("After updating02: " + examScore.toString());
    }
}
