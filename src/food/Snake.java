package food;

public class Snake extends Animal implements Feeder {

    public Snake(String name, double weight) {
        super(name, weight);
        setFood(Food.SNAKE);
    }

    @Override
    public void printInfo() {
        System.out.println("Djurtyp: Orm");
        System.out.println("Namn: " + getName());
        System.out.println("Vikt i gram: " + getWeight());
    }

    @Override
    public void feedInfo() {
        System.out.println("Ormen " + getName() + " portion är " +
                String.format("%.2f", 20.00) + " gram " + getFood().getName());
    }
}
