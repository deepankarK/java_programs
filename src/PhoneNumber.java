import java.util.Scanner;

import static java.lang.System.exit;

public class PhoneNumber {

    public boolean checkNumber(long number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            ++count;
        }
        if(count == 10)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneNumber obj = new PhoneNumber();
        long phoneNumber;
        while(true) {
            System.out.println("Enter 10 digit number: ");
            phoneNumber = input.nextLong();
            if(obj.checkNumber(phoneNumber)) {
                exit(0);
                break;
            }
        }

    }
}
