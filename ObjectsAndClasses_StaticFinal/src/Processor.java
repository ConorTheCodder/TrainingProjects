public final class Processor {
    private final double frequency;
    private final int cores;
    private final String manufacturer;
    private final int weight; // in grams

    public Processor(double frequency, int cores, String manufacturer, int weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight=" + weight +
                '}';
    }
}
