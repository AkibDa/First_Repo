import java.util.HashMap;

class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 84);
        examScores.put("Comp", 90);
        examScores.put("Eng", 92);

        System.out.println(examScores.toString());
    }
}