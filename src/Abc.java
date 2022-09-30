import java.util.Scanner;

public class Abc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 100, num2 = 99999999;
        int check, rem, sum = 0;
        for (int i = num1; i < num2; i++) {
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem*rem*rem);
                check = check / 10;
            }

            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
