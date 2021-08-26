package array;

public class MultidimensionalArray {

    public static void main(String[] args) {
        int[][] intArray = new int[7][2];

        intArray[0][0] = 20;
        intArray[1][0] = 35;
        intArray[2][0] = -15;
        intArray[3][0] = 7;
        intArray[4][0] =55;
        intArray[5][0] = 1;
        intArray[6][0] = -22;
        //insert new values
        intArray[1][0] = 2;
        intArray[0][1] = 3;

        System.out.println(intArray[1][0]);
        System.out.println(intArray[0][1]);
    }
}
