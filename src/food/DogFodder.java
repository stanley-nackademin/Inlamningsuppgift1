package food;

public class DogFodder extends Fodder {

    protected double ratio;

    public DogFodder(FodderType fodderType, double ratio) {
        super(fodderType);
        this.ratio = ratio;
    }
}
