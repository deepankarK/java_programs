public class ExceptionHandle {
    public static void main(String[] args) {
        ExceptionHandle t = new ExceptionHandle();
        t.divide();
    }

    void divide(){
        int a = 0, b = 5, c;
        try{
            c = b/a;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Exception: " + e);
            System.out.println("Numbers can not be divided by zero.");
        }
    }
}

