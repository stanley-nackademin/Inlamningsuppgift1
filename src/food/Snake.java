package food;

public class Snake extends Animal {
    protected Fodder fodder;

    public Snake(String name, double weight) {
        super(name, weight);
        //fodder = new SnakePellet("ormpellets");
    }

    @Override
    public void printInfo() {
        System.out.println("Ormens namn: " + name);
        System.out.println("Ormens vikt: " + weight + " g");
    }
}
