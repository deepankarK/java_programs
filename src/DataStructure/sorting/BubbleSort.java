package DataStructure.sorting;

public class BubbleSort {

    public static void main(String args[]){
        int[] Int_array = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = Int_array.length - 1; lastUnsortedIndex > 0;
        lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (Int_array[i] > Int_array[i + 1]) {
                    swap(Int_array, i, i+1);
                }
            }
        }

        for(int i =0; i < Int_array.length; i++) {
            System.out.println(Int_array[i]);
        }

    }

    private static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}


