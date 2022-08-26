package Vehicle2;

public class Vehicle2 {

    private String make;
    private String color;
    private int year;
    private String model;

    public Vehicle2(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: "+ year);
        System.out.println("Model: " + model);
    }
}
