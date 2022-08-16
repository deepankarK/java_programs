package DataStructure.sorting;

public class InsertionSort {

    public static void main(String args[]){
        int array[] = {20, 15, 2, 1 , 6, 76, 87};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }
        for(int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
