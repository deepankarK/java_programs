public class PhoneNumberString {

    static void countDigits(int n){
        String number = Integer.toString(n);
        System.out.println(number.length());
    }

    public static void main(String[] args) {
        int n = 899066;
        countDigits(n);
    }
}
