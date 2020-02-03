package c1AccessModifier;

public class child extends parent {

    public static void memberChild1(){

        setRencana2("protected ngga akan bisa");
        //System.out.println(getRencana2());

        //diakses dari: class yang berada satu package dengannya
        System.out.println(wacana);

//        setRencana3("private masih bisa");
//        System.out.println(getRencana3());
    }

    public static void main(String[] args){

        memberChild1();
    }
}
