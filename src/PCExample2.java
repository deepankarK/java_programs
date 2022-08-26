public class PCExample2 {

    private int var;
    public PCExample2() { this.var = 10; }
    public PCExample2( int num) {this.var = num;}

    public static void main(String[] args) {
        PCExample2 obj = new PCExample2();
        PCExample2 obj2 = new PCExample2(100);
        System.out.println(obj.var);
        System.out.println(obj2.var);
    }
}
