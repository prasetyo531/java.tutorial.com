package c1AccessModifier;

public class child extends parent {

    public static void memberChild1(){

        setRencana2("private ngga akan bisa");
        //System.out.println(getRencana2());

        setRencana3("protected masih bisa");
        System.out.println(getRencana3());
    }

    public static void main(String[] args){

        memberChild1();
    }
}
