package food;

public class Dog extends Animal implements Feeder {

    public Dog(String name, double weight) {
        super(name, weight);
        setFood(Food.DOG);
    }

    @Override
    public void printInfo() {
        System.out.println("Djurtyp: Hund");
        System.out.println("Namn: " + getName());
        System.out.println("Vikt i gram: " + getWeight());
    }

    @Override
    public void feedInfo() {
        System.out.println("Hunden " + getName() + "s portion är " + (getWeight() / getFood().getRatio()) + " gram " + getFood().getName());
    }
}
