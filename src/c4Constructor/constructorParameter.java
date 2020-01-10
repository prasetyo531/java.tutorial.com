package c4Constructor;

public class constructorParameter {

    //definition variable
    //Variable Luar
    String programming = "Java";
    int angka = 77;

    //Konstruktor dengan 2 Parameter
    public constructorParameter(String programming_baru, int angka_baru){

        programming = programming_baru;
        angka = angka_baru;
    }

    public static void main(String[] args){

        //Objek Pertama
        constructorParameter data1 = new constructorParameter("Swift", 700);

        //Objek Kedua
        constructorParameter data2 = new constructorParameter("C++", 457);

        //Mencetak Nilai dari Objec Pertama
        System.out.println("====== DATA1 ======");
        System.out.println(data1.programming);
        System.out.println(data1.angka);

        //Mencetak Nilai dari Objec Pertama
        System.out.println("====== DATA2 ======");
        System.out.println(data2.programming);
        System.out.println(data2.angka);
    }
}
