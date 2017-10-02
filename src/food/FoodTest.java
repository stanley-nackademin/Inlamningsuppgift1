package food;

public class FoodTest {
    protected Food food;

    public FoodTest(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return food.toString();
    }
}
