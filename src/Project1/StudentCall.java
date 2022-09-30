package Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCall extends StudentID{

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        StudentID obj = new StudentID();
        String localName[] = {"Arjun","Rishika","Yash","Simon","Sideman"};
        int localAge[] = {18, 19, 23, 22, 39};
        String localBloodGroup[] = {"B+","O-","A+","B-","AB+"};

        obj.setName(localName);
        obj.setAge(localAge);
        obj.setBloodGroup(localBloodGroup);

        System.out.println(obj.toString());


    }

}
