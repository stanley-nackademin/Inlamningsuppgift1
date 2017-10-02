package food;

public class Snake extends Animal {
    protected FoodTest foodTest;

    public Snake(String name, double weight) {
        super(name, weight);
        //foodTest = new SnakePellet("ormpellets");
    }

    @Override
    public void printInfo() {
        System.out.println("Ormens namn: " + name);
        System.out.println("Ormens vikt: " + weight + " g");
    }
}
