package food;

public enum FodderType {
    Hundfoder(100),
    Kattfoder(150),
    Ormpellets(0);

    private int ratio;

    public int getRatio() {
        return ratio;
    }

    FodderType(int ratio) {
        this.ratio = ratio;
    }
}
