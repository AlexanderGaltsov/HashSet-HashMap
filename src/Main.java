import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {


        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < (TEXT.length() - 1); i++) {
            char simbol = TEXT.charAt(i);
            if (!Character.isLetter(simbol)) {
                continue;
            }
            if (map.containsKey(simbol)) {
                map.put(simbol, map.get(simbol) + 1);
            } else {
                map.put(simbol, 1);
            }
        }
        int max = -1;
        char maxSimbol = 0;
        for (char simbol : map.keySet()) {
            int freq = map.get(simbol);
            if (freq > max) {
                max = freq;
                maxSimbol = simbol;
            }
        }
        int min = Integer.MAX_VALUE;
        char minSimbol = 0;
        for (char simbol : map.keySet()) {
            int freq = map.get(simbol);
            if (freq < min) {
                min = freq;
                minSimbol = simbol;
            }
        }
        System.out.println("Чаще всего встречается " + maxSimbol + ":" + max + " раз");
        System.out.println("Реже всего встречается " + minSimbol + ":" + min + " раз");
    }
}

