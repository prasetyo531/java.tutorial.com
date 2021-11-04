package array;

public class PrintAllArray {

    public static void main(String[] args) {

        int[] myarr= {10, 4, 10, 20, 30};

        for(int i=0; i < myarr.length; i++) {
            System.out.println(myarr[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {

    if(i==j) {
        return;
    }

    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
}
