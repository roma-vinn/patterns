public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();

        CarDirector director = new CarDirector();
        director.setCarBuilder(carBuilder);

        Car car = director.makeDefaultCar();
        Car sportCar = director.makeSportCar();

        System.out.println(car);
        System.out.println(sportCar);

    }
}
