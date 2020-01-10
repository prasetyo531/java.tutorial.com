package c4Constructor;

public class parameterMethod {

    String pekerjaan = "QA Engineer";

    public parameterMethod(String pekerjaan){

        //this untuk menyatakan variabel yang dimaksud adalah variabel yang ada di dalam class
        this.pekerjaan = pekerjaan;
    }

    public static void main(String[] args){

        parameterMethod c1 = new parameterMethod("Front Engineer");

        parameterMethod c2 = new parameterMethod("Backend Engineer");

        // 1 - void
        c1.printOutput1("prasetyo","jakarta");

        // 2 - static
        printOutput2("putra",12);

        // 3 - return
        c1.nama("budi");
        c1.domisili("kemang tendean");


    }

    void printOutput1(String nama, String tempatLahir){

        System.out.println("nama saya adalah"+" "+nama);
        System.out.println("tempat lahir saya adalah di"+" "+tempatLahir);
    }

    static void printOutput2(String hobi, int tglLahir){

        System.out.println("hobi saya adalah"+" "+hobi);
        System.out.println("tanggal lahir saya adalah"+" "+tglLahir);
    }

    String nama(String nama){

        System.out.println(nama);

        return nama;
    }

    String domisili(String domisili){

        //this untuk menyatakan variabel yang dimaksud adalah variabel yang ada di dalam class
        //this untuk menyatakan parameter yang dimaksud adalah parameter yang ada di luar class
        System.out.println(domisili);

        return domisili;
    }

    String tempatLahir(String tempatLahir){

        return tempatLahir;
    }

    String hobi(String hobi){

        return hobi;
    }

    Integer tglLahir(int tglLahir){

        return tglLahir;
    }

}
