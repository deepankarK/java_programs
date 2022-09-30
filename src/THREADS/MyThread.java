package THREADS;

public class MyThread {
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        System.out.println("Current Thread is " + obj);
        System.out.println("Name of current thread is " + obj.getName());
    }
}


// in this program is a static method in a class thread once we have the static method then
// with the class name we can call the current thread method. this method returns the reference of main thread
// because this is called inside the main thread
//the reference of main thread will be stored in a variable object of type thread
//when this code will be executed by jvm it will dislpay an output Thread[main,5,main] on scren
//here main represents name of the thread the and 5 represents the priority of thread
//every thread will have a priority number associated with it and it can range from 1 to 10
//the third value 'main' represents the name of the group to which main thread belongs to
//obj.getName() method of thread class returns the name of the thread that is referred by object obj

//main points of thread:
// 1. threads are mainly used in server site programs where we need to handle multiple clients on network simultaneously
// 2. threads can be used in creating games and animations
// 3. it can be used to show picture in motion
// 4. in many games threads help to perform more than one task simultaneously
// 5. it is a flow of execution from beginning to end
// 6. when we write a group of statements in a program
//this execution process is called thread in java
//there is always at-least one thread running internally in every program and this thread is used by jvm to execute statements in program
//when a program contains a single throw of control than it is called single threaded program
// java threads are light weight threads because they cna be executed in the same memory space becasue all the threads in
//the main application program share sa,e address in the memory so that they can easily communicate among themselves.
// thus they also take less space in the memory and less process time.