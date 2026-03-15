public class Transport {

    private String brand;
    private String model;
    private int year;

    public Transport(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getInfo() {
        return "Brand: " + brand +
               ", Model: " + model +
               ", Year: " + year;
    }

    public void move() {
        System.out.println("Transport is moving");
    }
}