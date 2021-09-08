package sortAlgo;

public class BubleSortString {

    public static void main(String[] args) {

        String[] stringArray = {"adi", "aci", "abi", "caca"};

        // - all array on start is unsorted index
        for (int lastUnsortedIndex = stringArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (stringArray[i].compareToIgnoreCase(stringArray[i+1])>0) {
                    swap(stringArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);

        }
    }


    //1. create swap method
    // static because will called on main method
    public static void swap(String[] array, int i, int j) {

        //first logic, if same no action
        if (i == j){
            return;
        }

        //second logic, do swap
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
