package food;

public abstract class Animal {
    protected String name;
    protected double weight; // In gram

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    abstract void printInfo();
}
