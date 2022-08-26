public class Parent {
    void print() {
        System.out.println("Parent Class");
    }

}
class subclass1 extends Parent {
    void print() {
        System.out.println("Subclass 1");
    }
}

class subclass2 extends subclass1 {
    void print() {
        System.out.println("Subclass 2");
    }
}
