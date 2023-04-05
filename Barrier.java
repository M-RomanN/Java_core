package hw_lesson_1;

public abstract class Barrier {
    public abstract void doIt(Competitor competitor);
}

class Wall extends Barrier {
    int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

class Water extends Barrier {
    int length;
    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}

class Cross extends Barrier {
    int length;
    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}

class MainCross {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Bob"), new Human("Max"), new Human("Donald")};
        Barrier[] barriers = {new Cross(1000), new Wall(2), new Water(100)};

        for (Competitor competitor : competitors) {
            for (Barrier barrier : barriers) {
                barrier.doIt(competitor);
                if (!competitor.isOnDistance()) {
                    break;
                }
            }
        }
        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}