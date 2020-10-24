package udemyVinsguru;

import java.util.Arrays;

public class referenceTypeWorks {

    //https://books.trinket.io/thinkjava/chapter8.html

    /*** include ***
     array
     string
     */


    public static void main(String[] args) {

        //new int = create object in the memory
        int[] arr = new int[] {1, 2, 3};  /// refer to an array of integer
        String[] nama = {"pras","budi","putra"};

        System.out.println("before angka::" + Arrays.toString(arr));
        System.out.println("before nama::" + Arrays.toString(nama));

        referenceTypeWorks ref = new referenceTypeWorks();

        ref.increaseNumeric(arr);
        System.out.println("after angka ::" + Arrays.toString(arr));

        ref.changeString(nama);
        System.out.println("after nama ::" + Arrays.toString(nama));

    }

    public static void change(int[] c){

        c = new int[] {5, 7, 9};
        c[0]++;
        c[1]++;
        c[2]++;
    }

    public void increaseNumeric(int[] a) {

        a[0]++;
        a[1]++;
        a[2]++;

    }

    public void changeString(String[] b){

        //value cant replaced, imutable behaviour
        b[0].replace("pras", "prasetyo");
        b[2].replace("putra","putranto");
    }
}
