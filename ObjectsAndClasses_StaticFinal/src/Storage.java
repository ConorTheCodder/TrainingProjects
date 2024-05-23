public final class Storage {
    private final StorageTypeEnum type;
    private final int capacity;
    private final int weight; // in grams

    public Storage(StorageTypeEnum type, int capacity, int weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public StorageTypeEnum getType() {
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
        return "Storage{" +
                "type='" + type.toString() + '\'' +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }
}
