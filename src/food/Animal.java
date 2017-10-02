package food;

public abstract class Animal {
    protected String name;
    protected double weight; // In gram

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    abstract void printInfo();
}
