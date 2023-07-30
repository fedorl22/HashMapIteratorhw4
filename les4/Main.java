package les4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;
 
class Main
{
    // Программа для перебора с использованием `entrySet()`
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(33, "One");
        map.put(55, "One");

        // Использование итератора
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Цикл For-each
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = (Integer) entry.getKey();
            String value = entry.getValue();

            System.out.println(key + "=" + value);
        }

        // Java 8 — использование `Iterator.forEachRemaining()`
        map.entrySet()
                .iterator()
                .forEachRemaining(System.out::println);

    }
    
}