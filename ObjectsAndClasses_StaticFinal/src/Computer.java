public class Computer {

    private final String vendor;
    private final String name;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }



    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    private Processor processor;
    private RAM ram;
    private Storage storage;
    private Display display;
    private Keyboard keyboard;

    public int getOverallWeight() {
        return processor.getWeight() + ram.getWeight() + storage.getWeight() +
                display.getWeight() + keyboard.getWeight();

    }


    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Производитель компьютера: " + vendor + "\n" + "Название компьютера: " + name;


    }

}

