import java.util.HashMap;
import java.util.Map;

public class Main {


    // Создали поле с текстом
    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        // Создали коллекцию
        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < (TEXT.length() - 1); i++) {  // Проходим по тексту
            char simbol = TEXT.charAt(i);                // Сохраняем каждый символ в переменную
            if (!Character.isLetter(simbol)) {           // Проверяем, что это действительно символ
                continue;                                // Если не символ, берем следующий на проверку
            }
            if (map.containsKey(simbol)) {               // Проверяем ключи коллекции на совпадение с символом
                map.put(simbol, map.get(simbol) + 1);    // Если совпадает, в коллекцию добовляем символ ключом, а к значению прибавляем единицу
            } else {
                map.put(simbol, 1);                      // Если не совпадает, добавляем в коллекцию символ ключом и значение единица
            }
        }

        int max = -1;                                    // Создаем переменную
        char maxSimbol = 0;                              // Создаем переменную
        for (char simbol : map.keySet()) {               // Каждый ключ из коллекции сохраняем в переменную
            int freq = map.get(simbol);                  // Сохраняем в переменную значение коллекции по ключу
            if (freq > max) {                            // Если значение из коллекции больше максимального значения
                max = freq;                              // В максимальное значение записывается значение из коллекции
                maxSimbol = simbol;                      // В переменную записывается ключ максимального значения
            }
        }

        int min = Integer.MAX_VALUE;                      // Создаем переменную
        char minSimbol = 0;                               // Создаем переменную
        for (char simbol : map.keySet()) {                // Каждый ключ из коллекции сохраняем в переменную
            int freq = map.get(simbol);                   // Сохраняем в переменную значение коллекции по ключу
            if (freq < min) {                             // Если значение из коллекции меньше минимального значения
                min = freq;                               // В минимальное значение записывается значение из коллекции
                minSimbol = simbol;                       // В переменную записывается ключ минимального значения
            }
        }
        System.out.println("Чаще всего встречается " + maxSimbol + ":" + max + " раз");
        System.out.println("Реже всего встречается " + minSimbol + ":" + min + " раз");
    }
}

