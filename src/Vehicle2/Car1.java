package Vehicle2;

public class Car1 extends Vehicle2{

    private String bodyStyle;
    public Car1(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
    }

    public void carDetails() {
        printDetails();
        System.out.println("Body Style: " + bodyStyle);
    }
}
