import java.util.*;
import java.util.stream.Collectors;

public class Methods {
    public static void sortAndGroupBasedOnLetters(List<String> stringList) {
        Map<Integer, List<String>> sortedAndGroupedStrings = stringList.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));

        for (Map.Entry<Integer, List<String>> entry : sortedAndGroupedStrings.entrySet()) {
            int length = entry.getKey();
            List<String> strings = entry.getValue();
            System.out.println("String with " + length + " letters: " + strings);
        }
    }
    public static void onlyShowSameNumberOfLetters(List<String> stringList) {
        Map<Integer, List<String>> integerListMap = stringList.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        for (Map.Entry<Integer, List<String>> entry : integerListMap.entrySet()) {
            List<String> stringList1 = entry.getValue();
            System.out.println("string with the same length " + stringList1);
        }
    }
}


