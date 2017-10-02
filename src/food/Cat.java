package food;

public class Cat extends Animal {
    protected FoodTest foodTest;

    public Cat(String name, double weight) {
        super(name, weight);
        //foodTest = new CatFodder("kattfoder");
    }

    @Override
    public void printInfo() {
        System.out.println("Kattens namn: " + name);
        System.out.println("Kattens vikt: " + weight + " g");
    }
}
