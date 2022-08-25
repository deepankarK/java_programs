//wap to find majority element in an array
public class MajorityElement {
    static void findMajority(int array[], int n) {
        int maxCount = 0;
        int index = -1;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
                if(count > maxCount) {
                    maxCount = count;
                    index = 1;
                }
            }

            if (maxCount > n/2) {
                System.out.println(array[index]);
            }
            else {
                System.out.println("No majority Element");
            }
        }
    }

    public static void main(String[] args) {

        int array[] = {1,1,1,4,3,1,2,1};

        int n = array.length;
        findMajority(array, n);
    }
}
