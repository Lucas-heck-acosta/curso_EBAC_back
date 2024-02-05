public class NissanCarFactory implements CarFactory{
    @Override
    public Car createCar(String model) {
        System.out.println("Nissan Factory: Manufacturing Nissan " + model);
        NissanCar car = new NissanCar();
        car.setModel(model);
        System.out.println(model + " is Ready for use.");
        return car;
    }
}
