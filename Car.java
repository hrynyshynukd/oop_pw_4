public class Car extends Transport {

    private int passengerCount;

    public Car(String brand, String model, int year, int passengerCount) {
        super(brand, model, year);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCapacity() {
        return passengerCount;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", Passengers: " + passengerCount;
    }

    @Override
    public void move() {
        System.out.println("Автомобіль їде по дорозі");
    }
}