package THREADS;

public class Demonstration2XYZ {
    public static void main(String[] args) {
        ThreadX x = new ThreadX();
        Thread t1 = new Thread(x);

        ThreadY y = new ThreadY();
        Thread t2 = new Thread(y);

//        ThreadZ z = new ThreadZ();
//        Thread t3 = new Thread(z);

        Thread t3 = new Thread(new ThreadZ());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("...Multithreading is over");
    }
}
