package c4Constructor;

public class constructor {

    //definition variable
    //Variable diluar Konstruktor
    String programming = "Java";
    int angka = 77;

    //Konstruktor
    public constructor(){
        //Variable Didalam Konstruktor
        programming = "Kotlin";
        angka = 100;
    }

    public static void main(String[] args){
        //Membuat Objek dari Class
        constructor data = new constructor();
        System.out.println(data.programming);
        System.out.println(data.angka);
    }
}
