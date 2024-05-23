public final class Display {
    private final double diagonal;
    private final DisplayTypesEnum type;
    private final int weight; // in grams


    public Display(double diagonal, DisplayTypesEnum type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public DisplayTypesEnum getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "size=" + diagonal +
                ", type='" + type.toString() + '\'' +
                ", weight=" + weight +
                '}';
    }
}
