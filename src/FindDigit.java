public class FindDigit {

    static int count_digits(int num){
        int count = 0;
        while (num != 0){
            num /= 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {

        int number = 32655;
        System.out.println("Number of digits in " + number + " is " + count_digits(number));
    }
}
