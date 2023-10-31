import java.util.*;
import java.util.stream.Collectors;

public class Methods {
    public static void sortAndGroupBasedOnLetters(List<String> stringList) {
        System.out.println();
        System.out.println("----Sorted and grouped based on letters----");
        Map<Integer, List<String>> sortedAndGroupedStrings = stringList.stream()
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));

        for (Map.Entry<Integer, List<String>> entry : sortedAndGroupedStrings.entrySet()) {
            int length = entry.getKey();
            List<String> strings = entry.getValue();
            System.out.println("String with " + length + " letters: " + strings);

        }
    }

    public static void onlyShowSameNumberOfLetters(List<String> stringList) {
        //First solution
//        for (String s : stringList) {
//            int num = s.length();
//            System.out.println("   String : " + s + "   Length of the string is : " + num);
//        }
        //Second solution
        System.out.println("-----Only showing strings with their lengths and they are not grouped-----");
        stringList.stream().map(s -> "String : " + s + "   length is = " + s.length()).forEach(System.out::println);
    }
}



