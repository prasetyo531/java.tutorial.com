package c2StaticNonStaticFinal;

public class nonStaticExample {

    static String wide="lebar kantor";
    Integer lebar = 1;

    void ukuranGedung(){

        System.out.println("ukuran gedung");
    }

    void ukuranGedungSebelah(){

        System.out.println("gedung sebelah");
    }

    void aksesStaticFromNonStatic(){

        //non-static method can access static data members
        System.out.println(wide);
    }

    public static void main(String[] args){

        nonStaticExample n = new nonStaticExample();
        System.out.println(n.lebar);

        //non-static method can access static data members
        n.aksesStaticFromNonStatic();
    }
}
