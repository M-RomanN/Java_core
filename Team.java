package hw_lesson_1;

public class Team {
    String nameTeam;
    Human Bob = new Human("Bob", 2, 1000, 200);
    Human Max = new Human("Max", 2, 1100, 210);
    Human Donald = new Human("Donald", 3, 1500, 300);
    Human Fred = new Human("Fred", 1, 900, 150);

    Competitor[] partner = new Competitor[4];
    Human[] humans = {Bob, Max, Donald, Fred};


    public Team(String nameTeam, Competitor competitor1, Competitor competitor2, Competitor competitor3,
                Competitor competitor4) {
        this.nameTeam = nameTeam;
        partner[0] = competitor1;
        partner[1] = competitor2;
        partner[2] = competitor3;
        partner[3] = competitor4;
    }

    public void passedTheDistance() {
        for (Competitor com : partner) {
            if (com.isOnDistance()) {
                com.info();
            }
        }
    }

    public void showResults() {
        for (Competitor competitor : partner) {
            competitor.info();
        }
    }

    public Competitor[] getTeammates() {
        return partner;
    }
}