import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2020, 5);
        Truck truck = new Truck("Volvo", "FH16", 2018, 18);
        Bike bike = new Bike("Yamaha", "R1", 2022, 998);

        List<Transport> vehicles = Arrays.asList(car, truck, bike);

        for (Transport vehicle : vehicles) {

            System.out.println(vehicle.getInfo());

            vehicle.move();

            if (vehicle instanceof Car) {
                Car c = (Car) vehicle;
                System.out.println("Passenger capacity: " + c.getPassengerCapacity());
            }

            if (vehicle instanceof Truck) {
                Truck t = (Truck) vehicle;
                System.out.println("Cargo capacity: " + t.getCargoCapacity());
            }

            if (vehicle instanceof Bike) {
                Bike b = (Bike) vehicle;
                System.out.println("Engine volume: " + b.getEngineVolume());
            }

            System.out.println("-----------------------");
        }
    }
}