import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        String str = "wresource";

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (freq.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }

        System.out.println("String: " + str);
        System.out.println("Unique character " + index);
    }
}