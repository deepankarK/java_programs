import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {

    public static void main(String[] args) {
        int array1[] = {80, 10, 15,  2, 35, 60};
        int array2[] = {35, 80, 60, 20, 25};

        printIntersection(array1, array2);
    }

    static void printIntersection(int arr1[], int arr2[]){
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i< arr1.length; i++){
            s.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++) {
            if(s.contains(arr2[i]))
                 System.out.print(arr2[i] + " ");
        }
    }

}
