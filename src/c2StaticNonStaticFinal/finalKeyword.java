package c2StaticNonStaticFinal;

public class finalKeyword {

    final static Integer tinggi=10;
    String ukuran= "tinggi";

    /*
    The final keyword applied to a field means that the field's value can no longer be changed after initialization.
    In this way, we can define constants in Java.
     */
    static final String address = "jalan tendean kemang";


    public static void main(String[] args){

        //print static data members
        //tinggi = 12; cant rewrite variable tinggi
        System.out.println(tinggi);

        //create instantiate
        finalKeyword k = new finalKeyword();
        System.out.println(k.ukuran);

        //print static final data members
        //address = "gang tendean";
        System.out.println(address);
    }
}
