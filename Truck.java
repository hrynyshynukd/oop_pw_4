public class Truck extends Transport {

    private double cargoCapacity;

    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", Cargo capacity: " + cargoCapacity + " tons";
    }

    @Override
    public void move() {
        System.out.println("Вантажівка перевозить вантаж");
    }
}