
import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1(){
        System.out.println("Задание 1");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println("\n");
    }

    public static void task2(){
        System.out.println("Задание 2");
        Set<Integer> uniqueNums = new TreeSet<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueNums.add(num);
            }
        }

        for (int num : uniqueNums) {
            System.out.println(num);
        }
        System.out.println("\n");
    }

    public static void task3(){
        System.out.println("Задание 3");
        Set<String> uniqueWords = new HashSet<>(strings);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
        System.out.println("\n");
    }

    public static void task4(){
        System.out.println("Задание 4");
        Set<String> uniqueStrings = new HashSet<>(strings);
        for (String uniqueString : uniqueStrings) {
            int count = Collections.frequency(strings, uniqueString);
            System.out.println(uniqueString + " повторяется " + count + " раз(а)");
        }
        System.out.println("\n");
    }

}
