import java.util.Scanner;

public class DeciToBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, i= 1;
        System.out.println("Enter a decimal value: ");
        int decimal = sc.nextInt();
        int binary = 0;
        while(decimal > 0){
            rem = decimal%2;
            binary += rem * i;
            i *= 10;
            decimal /= 2;
        }
        System.out.println(binary);
    }

}
