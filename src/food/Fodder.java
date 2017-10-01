package food;

public class Fodder {
    protected FodderType fodderType;

    public Fodder(FodderType fodderType) {
        this.fodderType = fodderType;
    }

    @Override
    public String toString() {
        return fodderType.toString();
    }
}
