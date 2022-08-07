public class myClassFifth {
    String name;
    int age;
    String address;

    public myClassFifth (String name, int age, String address) {
        this.name = name;
        this.age =  age;
        this.address = address;
    }

    public static void main(String args[]) {
        myClassFifth obj1 = new myClassFifth("Deepankar", 26, "Delhi");
        myClassFifth obj2 = new myClassFifth("Arjun", 33, "Jaipur");

        System.out.println(obj1.name + " " + obj1.age + " " + obj1.address);
        System.out.println(obj2.name + " " + obj2.age + " " + obj2.address);
    }

}
