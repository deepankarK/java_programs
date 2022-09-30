public class ExceptionCount {
    int count = 0;
    void A() throws Exception{
        try {
            count++;
            System.out.println("Try 1: " + count);
            try{
                count++;
                System.out.println("Try 2: " + count);
                try{
                    count++;
                    System.out.println("Try 3: " + count);
                    throw new Exception();
                }catch (Exception e){
                    count++;
                    System.out.println("Inner 3 catch: " + count);
                    throw new Exception();
                }
            }catch (Exception e){
                count++;
                System.out.println("Inner 2 catch: " + count);
            }
        }catch (Exception e){
            count++;
            System.out.println("Inner 1 catch: " + count);
        }
    }

    void display(){
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) throws Exception {
        ExceptionCount t = new ExceptionCount();
        t.A();
        t.display();
    }
}
