package hw_lesson_4;

import java.util.*;

public class Phonebook {
    private Map<String, HashSet<String>> map;

    Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String surname, String phoneNumber) {
        HashSet<String> numbers;
        if (map.containsKey(surname)) {
            numbers = map.get(surname);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNumber);
        map.put(surname, numbers);
    }

    Set<String> get(String surname) {
        return map.get(surname);
    }
}