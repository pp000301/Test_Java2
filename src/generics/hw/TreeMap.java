/*Задан текст на английском языке. Выделить все различные слова. Для каждого слова подсчитать частоту его встречаемости.
 Слова, отличающиеся регистром букв, считать различными. Воспользуйтесь для этой цели классом TreeMap<String, Integer>.
*/

package generics.hw;

import java.util.*;
import java.util.List;
import java.util.Map;

public class TreeMap {
    public String text;

    public TreeMap(String text) {
        this.text = text;
    }

    public static void map(String text) {
        List<String> items = Arrays.asList(text.split(" "));//разбивка строки по разделителю в список
        Map<String, Integer> map = new HashMap<>();
        for (String i : items) {
            int count = 0;
            for (String k : items) {
                if (i.equals(k))
                    count++;
            }
            map.put(i, count);
        }
        System.out.println(map);
    }

    @Override
    public String toString() {
        return "TreeMap{" +
                "text='" + text + '\'' +
                '}';
    }
}
