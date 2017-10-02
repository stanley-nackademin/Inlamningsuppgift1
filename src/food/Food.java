package food;

public enum Food {
    DOG(100, "hundfoder"),
    CAT(150, "kattfoder"),
    SNAKE(0, "ormpellets");

    private int ratio;
    private String name;

    public int getRatio() {
        return ratio;
    }

    public String getName() {
        return name;
    }

    Food(int ratio, String name) {
        this.ratio = ratio;
        this.name = name;
    }
}
