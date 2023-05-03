package hw_lesson_9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Вася", Arrays.asList(new Course("Химия"), new Course("Физика"),
                new Course("Аналитика"))));
        students.add(new Student("Алексей", Arrays.asList(new Course("Математика"), new Course("Черчение"),
                new Course("Программирование"), new Course("Алгоритмизация"))));
        students.add(new Student("Александр", Arrays.asList(new Course("Химия"), new Course("Анатомия"),
                new Course("Аналитика"), new Course("Алгоритмизация"))));

        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));

        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("Testing");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}