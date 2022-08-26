public class PCExample{
    private int var;
    public PCExample(int num) {var = num;}

    public int getVar() {
        return var;
    }

//    public void setVar(int var) {
//        this.var = var;
//    }

    public static void main(String[] args) {
        PCExample obj = new PCExample(2);
        System.out.println("Value of var is " + obj.getVar());
    }
}
