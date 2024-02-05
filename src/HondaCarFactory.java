public class HondaCarFactory implements CarFactory {
    @Override
    public Car createCar(String model) {
        System.out.println("Honda Factory: Manufacturing Honda " + model);
        HondaCar car = new HondaCar();
        car.setModel(model);
        System.out.println(model + " is Ready for use.");
        return car;
    }
}
