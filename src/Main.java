import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
            " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco" +
            " laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate" +
            " velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident," +
            " sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        text = text.toLowerCase();
        int maxValue = Integer.MIN_VALUE;
        char max = 0;
        int minValue = Integer.MAX_VALUE;
        char min = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (map.get(c) == null) {
                    map.put((c), 1);
                } else {
                    map.put((c), map.get(c) + 1);
                }
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) <= minValue) {
                minValue = map.get(c);
                min = c;
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) >= maxValue) {
                maxValue = map.get(c);
                max = c;
            }
        }
        System.out.println("Символы и их количество в тексте: " + map.entrySet());
        System.out.println("Самый редкий символ: " + min + ". Текст содержит " + minValue + " символ(-а).");
        System.out.println("Самый частый символ: " + max + ". Текст содержит " + maxValue + " символ(-а).");
    }
}