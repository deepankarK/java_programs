import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) {

        //first
        try {
            int a = 0;
            int b = 5 / a;
        } catch (Exception e) {
            System.out.println("Number can not be divided by zero.");
        }

        //second practical
        try {
            FileInputStream fi = new FileInputStream("D:/abc.txt");
        } catch (FileNotFoundException e) {
//            System.out.println(e);
            System.out.println("File is in D drive.");
        }

        //third practical
        try {
            try {
                String name = null;
                System.out.println(name.length());
            }
            catch (NullPointerException e) {
                System.out.println("String is null");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}


