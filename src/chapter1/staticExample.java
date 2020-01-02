package chapter1;

public class staticExample {

    static Integer tinggi=0;
    String ukuran= "tinggi";

    void gedung(){

        System.out.println("gedung");
    }

    void gedungTinggi(){

        System.out.println("tinggi");
    }

    public static void main(String[] args) {

        System.out.println(tinggi);
        //ukuran g bisa dipanggil karena bukan static, static method can only acccess static var

        tinggi = 1;
        //static method can rewrite the values of any static data member.
        System.out.println(tinggi);
    }

}
