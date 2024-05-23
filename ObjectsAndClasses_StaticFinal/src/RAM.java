public final class RAM {
    private final String type;
    private final int capacity;
    private final int weight; // in grams

    public RAM(String type, int capacity, int weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }
}
