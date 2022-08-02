import java.util.Scanner;
public class BinarytoDecimal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice, binary_value;

        while (true) {
            System.out.println("1. Enter Binary Value or, ");
            System.out.println("2. Exit.");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the value: ");
                    binary_value = sc.nextInt();
                    System.out.println("Binary To Decimal is: " + getDecimal(binary_value));
                }
                case 2 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        }
    }

    public static int getDecimal(int binary){
        int decimal = 0, num = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, num);
                binary = binary/10;
                num++;
            }
        }
        return decimal;
    }
}
