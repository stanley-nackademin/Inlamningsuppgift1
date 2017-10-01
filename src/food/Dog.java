package food;

public class Dog extends Animal implements Feeder {
    protected Fodder fodder;

    public Dog(String name, double weight) {
        super(name, weight);
        fodder = new Fodder(FodderType.Hundfoder);
        fodder.fodderType.getRatio();
    }

    @Override
    public void printInfo() {
        System.out.println("Hundens namn: " + name);
        System.out.println("Hundens vikt: " + weight + " g");
    }

    @Override
    public void feedInfo() {
        System.out.println("Hunden " + name + "s portion är " + (weight / fodder.fodderType.getRatio()) + " gram " + fodder.toString());
    }
}
