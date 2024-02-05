public class NissanCar implements Car{
    private String model;

    @Override
    public void display() {
        System.out.println("Nissan Car - Model: " + model);
    }

    @Override
    public void start() {
        System.out.println("Nissan Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Nissan Car is stopping...");
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
