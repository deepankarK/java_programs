// for third program use keyword final in from of String name = "Raju";
// final String name = "Raju";

// fourth program
public class Myclass {
    static void method1() {
        System.out.println("Static method");
    }
    public void method2() {
        System.out.println("public method");
    }

    public static void main(String args[]) {
        Myclass obj = new Myclass();
        obj.method1();
        obj.method2();
    }
}
//public class Myclass {
//    String name = "Raju";
//    public static void main(String args[]) {
//        Myclass obj = new Myclass();
//        obj.name = "Lolipop";
//
//        System.out.println(obj.name);
//    }
//}


//public class Myclass {
//    int x = 5;
//    public static void main(String args[]) {
//        Myclass obj = new Myclass();
//        obj.x = 40;
//
//        System.out.println(obj.x);
//    }
//}