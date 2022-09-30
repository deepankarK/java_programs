package THREADS;

public class ThreadM implements Runnable {
    String Task;
    ThreadM (String Task){
        this.Task = Task;
    }
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println(Task + "." + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){ e.printStackTrace();}
        }
    }


    public static void main(String[] args) {
        Thread nThread = Thread.currentThread();
        System.out.println("Name of the thread: " + nThread);
        ThreadM mt = new ThreadM("Hello Java");
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();

        int count = Thread.activeCount();
        System.out.println("No of active threads: " + count);
    }
}
