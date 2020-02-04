package udemyVinsguru;

import java.util.Arrays;

public class mutations {

    /*
    changin originial object state inside method in such way it lead unexpected result in programming
     */

    public static void main(String[] args) {


        int[] arr = new int[] {5, 4, 3};

        mutations m = new mutations();
        m.totalSale(arr);

        m.predict(arr);
    }

    public void totalSale(int[] a){

        System.out.println("total sale this month ::" + (a[0] + a[1] + a[2]));
    }

    public void predict(int[] a){

        a = Arrays.copyOf(a, a.length); //this code not touching original array or to avoding mutations
        a[0]++;
        a[2]++;
        System.out.println("prediction sale next month ::" + (a[0] + a[1] + a[2]));
    }
}
