public class App {
    public static void main(String[] args){
        CarFactory hondaFactory = new HondaCarFactory();
        Car hondaCar = hondaFactory.createCar("Civic");

        System.out.println("Honda Car Details:");
        hondaCar.display();
        hondaCar.start();
        hondaCar.stop();

        System.out.println("");

        CarFactory nissanFactory = new NissanCarFactory();
        Car nissanCar = nissanFactory.createCar("GTR");

        System.out.println("Nissan Car Details:");
        nissanCar.display();
        nissanCar.start();
        nissanCar.stop();
    }
}
