package udemyVinsguru;

import java.util.Arrays;

public class mutations {

    /*
    changing originial object state inside method in such way it lead unexpected result in programming
     */

    public static void main(String[] args) {


        int[] arr = new int[] {5, 4, 3}; // refer to an array of integer

        mutations m = new mutations();

        m.predictNextMonth(arr);

        m.currentSale(arr);

        m.predictMonth2(arr);
    }

    public void currentSale(int[] a){

        System.out.println("current sale this month ::" + (a[0] + a[1] + a[2]));
    }

    public void totalCurrentSale(int[] a){

        System.out.println("total sale this month ::" + (a[0] + a[1] + a[2]));
    }

    public void predictNextMonth(int[] a){

        //this code not touching original array or to avoding mutations
        //this code located on where increased method happened
        a = Arrays.copyOf(a, a.length);
        a[0]++;
        a[2]++;

        System.out.println("prediction next month ::" + (a[0] + a[1] + a[2]));;
    }

    public void predictMonth2(int[] a){

        //this code not touching original array or to avoding mutations
        //this code located on where increased method happened
        a = Arrays.copyOf(a, a.length);
        a[0]++;
        a[1]++;
        a[2]++;
        System.out.println("prediction next month ::" + (a[0] + a[1] + a[2]));;
    }
}
