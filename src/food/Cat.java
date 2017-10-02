package food;

public class Cat extends Animal implements Feeder {

    public Cat(String name, double weight) {
        super(name, weight);
        setFood(Food.CAT);
    }

    @Override
    public void printInfo() {
        System.out.println("Djurtyp: Katt");
        System.out.println("Namn: " + getName());
        System.out.println("Vikt i gram: " + getWeight());
    }

    @Override
    public void feedInfo() {
        System.out.println("Hunden " + getName() + "s portion är " + (getWeight() / getFood().getRatio()) + " gram " + getFood().getName());
    }
}
