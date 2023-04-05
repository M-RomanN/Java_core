package hw_lesson_1;

public class Course {
    Barrier[] course = new Barrier[3];
    public Course(Barrier barrier1, Barrier barrier2, Barrier barrier3) {
        course[0] = barrier1;
        course[1] = barrier2;
        course[2] = barrier3;
    }

    public void doIt(Team t) {
        System.out.println("\nTeam \"" + t.nameTeam + "\":\n");
        for (Competitor com : t.getTeammates()) {
            for (Barrier barrier: course) {
                barrier.doIt(com);
            }
        }
    }
}
