package udemyVinsguru;

public class primitiveTypeWorks {

    /*** include ***
     https://www.petanikode.com/java-variabel-dan-tipe-data/
    1.byte    -128 until 127
    1.short   -32768 until 32767
    1.int     -2147483648 until 2147483648
    1.long
     -- 1.whole number --
    2.float
    2.double  441.0
    -- 2.decimal number --
     char    unicode value
    boolean  true / false
     *** ***/

    int c = 20;
    static Byte bt = 127;
    static char ch = 77;

    public void angkaPrimitiveSatu(Integer a){

        a++;
        System.out.println(a);
    }

    public void angkaPrimitiveDua(Integer b){

        b++;
        System.out.println(b);
    }

    public void angkaPrimitiveTiga(Integer c){

        c++;
        System.out.println(c);
    }

    public static void main(String[] args) {

        primitiveTypeWorks p1 = new primitiveTypeWorks();
        p1.angkaPrimitiveSatu(10);
        p1.angkaPrimitiveDua(23);

        int c = 21;
        p1.angkaPrimitiveTiga(c);

        System.out.println(c); //will print member c in main method

        System.out.println("byte::" + bt);
        System.out.println("char::" + ch);


        //main ngga bisa println member yg didefinisikan di luar class "void type not allowed here
        //member yg didalam method main g bisa di rewrite

    }
}
