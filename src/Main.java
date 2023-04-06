import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // March 30th, 2023
    // write a program to count the number of times each character occurs in a string and then print the results to the console.
    public static int countCharacters(String str, boolean ignoreCase) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (ignoreCase) {
                c = Character.toLowerCase(c);
            }
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map.size();
    }
}