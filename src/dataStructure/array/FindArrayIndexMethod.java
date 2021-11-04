package array;

import java.util.Scanner;

public class FindArrayIndexMethod {

    public static void main(String[] args) {

        // membuat array buah-buahan
        int[] intArray = new int[4];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        int index = -1;
        for( int i = 0; i < intArray.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            intArray[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array         //1. array start from 0
        for (int i = 0; i < intArray.length; i++) {         //2. for condition: from zero to length array
            if (intArray[i] == 1) {                         //3. if condition: variable array and values you need to find
                index = i;                                  //4. initialize index same as i
                break;
            }
        }
        System.out.println("index = " + index);

    }

//    public static void arrayTest() {
//        //array size
//        int[] intArray = new int[7];
//
//        intArray[0] = 20;
//        intArray[1] = 35;
//        intArray[2] = -15;
//        intArray[3] = 7;
//        intArray[4] =55;
//        intArray[5] = 1;
//        intArray[6] = -22;
//
//        //find array index
//        int index = -1;                                     //1. array start from 0
//        for (int i = 0; i < intArray.length; i++) {         //2. for condition: from zero to length array
//            if (intArray[i] == 1) {                         //3. if condition: variable array and values you need to find
//                index = i;                                  //4. initialize index same as i
//                break;
//            }
//        }
//
//        System.out.println("index = " + index);
//    }
}
