package udemyVinsguru;

import java.util.Arrays;

public class referenceTypeWorks {

    /*** include ***
    array
     string
     */

    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3};
        String[] nama = new String[] {"pras","budi","putra"};

        System.out.println("before angka::" + Arrays.toString(arr));
        System.out.println("before nama::" + Arrays.toString(nama));

        referenceTypeWorks ref = new referenceTypeWorks();

        ref.changeNumeric(arr);
        System.out.println("after angka ::" + Arrays.toString(arr));

        ref.changeString(nama);
        System.out.println("after nama ::" + Arrays.toString(nama));

    }

    public void changeNumeric(int[] a) {

        a[0]++;
        a[1]++;
        a[2]++;

    }

    public void changeString(String[] b){

        b[0].replace("pras", "prasetyo");
        b[2].replace("putra","putranto");
    }
}
