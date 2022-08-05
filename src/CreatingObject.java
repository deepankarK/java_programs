public class CreatingObject {
    int roll = 5;
    String Name;
    String Subject = "Java";

    public static void main(String[] args) {
        CreatingObject myObj1 = new CreatingObject();  // Object 1
        myObj1.Name = "Deepankar Kumar";

        System.out.println("Roll No: " + myObj1.roll);
        System.out.println("Name: " + myObj1.Name);
        System.out.println("Subject: " + myObj1.Subject);
    }
}

