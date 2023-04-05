package hw_lesson_1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Cross(1000), new Water(50), new Wall(1));
        Team team;
        team = new Team("Stars", new Human("Bob"), new Human("Max"), new Human("Donald"), new Human("Fred"));
        course.doIt(team);

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");
        team.showResults();
    }
}