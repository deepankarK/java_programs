import java.util.Arrays;
import java.util.Scanner;

public class Abc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[]= {"Allu", "Raju", "Sparsh", "Niru"};
        int size = names.length;

        for (int i = 0; i<size - 1; i++) {
            for (int j = i + 1; j < names.length; i++) {
                if(names[i].compareTo(names[j]) > 0)
                {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = names[i];
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }

}

