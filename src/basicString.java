public class basicString {
    String name[] = new String[4];

    public static void main(String args[]) {
        basicString obj = new basicString();

        obj.name[0] = "Deepankar";
        obj.name[1] = "Arjun";
        obj.name[2] = "Sparsh";
        obj.name[3] = "Yash";

        for(int i = 0; i < 4; i++) {
            System.out.println("Names are " + obj.name[i]);
        }

    }
}
