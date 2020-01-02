package chapter1;

public class nonStaticExample {

    static String wide="lebar";
    Integer lebar = 1;

    void ukuranGedung(){

        System.out.println("ukuran gedung");
    }

    void ukuranGedungSebelah(){

        System.out.println("gedung sebelah");
    }

    public static void main(String[] args){

        nonStaticExample n = new nonStaticExample();
        System.out.println(n.lebar);
        //non-static method can access static data members

        wide = "lebar-lebar";
        System.out.println(wide);
    }
}
