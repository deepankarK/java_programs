public class basic {
    int marks[] = new int[4];
    public static void main(String args[]) {
        //int marks[] = new int[4];
        basic obj = new basic();
        for (int i =0; i < 4; i++) {
            obj.marks[i] = i + 1;
            System.out.println("Marks are " + obj.marks[i]);
        }
    }
}


