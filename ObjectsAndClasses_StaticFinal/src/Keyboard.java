public final class Keyboard {
    private final String type;
    private final boolean hasBacklight;
    private final int weight; // in grams

    public Keyboard(String type, boolean hasBacklight, int weight) {
        this.type = type;
        this.hasBacklight = hasBacklight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean hasBacklight() {
        return hasBacklight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "type='" + type + '\'' +
                ", hasBacklight=" + hasBacklight +
                ", weight=" + weight +
                '}';
    }
}
