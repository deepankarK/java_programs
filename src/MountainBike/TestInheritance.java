package MountainBike;

public class TestInheritance {

    public static void main(String[] args) {

        MountainBike obj = new MountainBike(3,100,25);
        System.out.println(obj.toString());

        System.out.println("--------After applying breaks--------");
        obj.applyBreak(10);
        System.out.println(obj.toString());

        System.out.println("--------After applying accelerator--------");
        obj.speedUp(80);
        System.out.println(obj.toString());

        System.out.println("--------After adjusting seat height--------" );
        obj.setHeight(30);
        System.out.println(obj.toString());
    }
}
