package sortAlgo;

public class BubleSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 10, 1, -22};

        // - all array on start is unsorted index
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }


    //1. create swap method
    // static because will called on main method
    public static void swap(int[] array, int i, int j) {

        //first logic, if same no action
        if (i == j){
            return;
        }

        //second logic, do swap
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
