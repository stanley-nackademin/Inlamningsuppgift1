package food;

public abstract class Animal {
    // Inkapsling av variabler här, kan endast ändras eller fås via getters och setters
    private String name;
    private double weight; // In gram
    private Food food;

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

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /*
    Detta är en form av polymorfism. Varje djur har sin egen implementering av printInfo() metoden.
    Den metod som anropas beror på vilket typ objektet är.

    Det här är även en form av dynamisk bindning. Subklassen som ärver Animal-klassen kommer att method override
    och ha sin implementering.
     */
    abstract void printInfo();
}
