package THREADS;

public class ThreadX implements Runnable{
    public void run() {
        for(int i = 1; i <=5; i++){
            System.out.println("From Thread A with i = " + -1*i);
        }
        System.out.println("Existing from Thread A....");
    }
}

class ThreadY implements Runnable{
    public void run() {
        for(int i = 1; i <=5; i++){
            System.out.println("From Thread B with j = " + +2*i);
        }
        System.out.println("Existing from Thread B....");
    }
}

class ThreadZ implements Runnable{
    public void run() {
        for(int i = 1; i <=5; i++){
            System.out.println("From Thread c with k = " + (2*i - 1));
        }
        System.out.println("Existing from Thread C....");
    }
}
