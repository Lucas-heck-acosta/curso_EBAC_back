public class HondaCar implements Car {
    private String model;

    @Override
    public void display() {
        System.out.println("Honda Car - Model: " + model);
    }

    @Override
    public void start() {
        System.out.println("Honda Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Honda Car is stopping...");
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

}
