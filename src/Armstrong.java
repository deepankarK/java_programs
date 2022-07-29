import java.util.Scanner;
import java.lang.Math;
class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, OriginalNumber;

        System.out.println("Enter an integer number: ");
        number = sc.nextInt();

        OriginalNumber = number;
        int count_number = count_digits(number);
        int final_result = check_armstrong(OriginalNumber, count_number);
        if(print_armstrong(final_result, number)) {
            System.out.println("This is a armstrong number.");
        }
        else {
            System.out.println("This is not a armstrong number.");
        }

    }

    static int count_digits(int num){
        int count = 0;
        while (num != 0){
            num /= 10;
            ++count;
        }
        return count;
    }

    static int check_armstrong(int originalNum, int count_num){
        int remainder = 0, sum = 0, num;
        while (originalNum != 0) {
            // remainder contains the last digit
            remainder = originalNum % 10;
            sum += Math.pow(remainder, count_num);
            originalNum /= 10;
        }
        return sum;
    }

    static boolean print_armstrong(int result, int originalNum) {
        if (result == originalNum)
            return true;
        else
            return false;
    }
}