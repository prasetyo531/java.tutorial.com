package dataStructure.array;

public class Array {

    public void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void main(String[] args) {
        Array array = new Array();
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        array.printArray(arr);
    }
}
