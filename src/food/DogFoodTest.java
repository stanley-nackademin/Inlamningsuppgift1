package food;

public class DogFoodTest extends FoodTest {

    protected double ratio;

    public DogFoodTest(Food food, double ratio) {
        super(food);
        this.ratio = ratio;
    }
}
