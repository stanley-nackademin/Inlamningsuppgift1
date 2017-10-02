package food;

public class DietCoach extends Person {

    public DietCoach(String name) {
        super(name);
    }

    public void feedInfo(Feeder animal) {
        animal.feedInfo();
    }
}
