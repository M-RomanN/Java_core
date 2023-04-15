package hw_lesson_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"mouse", "keyboard", "gamepad", "gamepad", "monitor", "scanner", "monitor", "mouse",
                "notebook", "notebook", "mouse", "mouse", "printer", "system_unit"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println("Список уникальных слов в массиве:\n" + uniq + "\n");
        System.out.println("Список слов в массиве с указанием количества повторений:\n" + map + "\n");


        Phonebook pb = new Phonebook();

        pb.add("Юдина", "9031234578");
        pb.add("Нефёдов", "9037324084");
        pb.add("Юдин", "9055451555");

        System.out.println(pb.get("Юдина"));
    }
}