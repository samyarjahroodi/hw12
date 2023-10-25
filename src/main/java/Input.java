import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    static List<String> stringList = new ArrayList<>();

    public static void addToList() {
        while (true) {
            System.out.println("Enter your string");
            stringList.add(scanner.next());
            System.out.println("If you want to quit press q");
            if (Objects.equals(scanner.next(), "q")) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("Your list have this strings " + stringList);
    }
}
