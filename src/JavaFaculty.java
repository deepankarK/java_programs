public class JavaFaculty extends Faculty{

    String mainSubject = "Java";
    void hacking() {
        System.out.println("Hacking is my hobby");
    }

    public static void main(String[] args) {
        JavaFaculty obj = new JavaFaculty();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
        obj.hacking();
    }

}
