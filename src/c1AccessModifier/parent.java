package c1AccessModifier;

public class parent {

    public static String rencana;
    private static String rencana2;
    protected static String rencana3;

    protected static String wacana="ke ancol";

    public static String getRencana() {

        return rencana;
    }

    public static void setRencana(String rencana) {

        parent.rencana = rencana;
    }

    protected static String getRencana2() {

        return rencana2;
    }

    protected static void setRencana2(String rencana2) {

        parent.rencana2 = rencana2;
    }

    private static String getRencana3() {

        return rencana3;
    }

    private static void setRencana3(String rencana3) {

        parent.rencana3 = rencana3;
    }

    public static void memberParent1(){

        setRencana("jalan");
        System.out.println(getRencana());
        setRencana2("kulineran");
        System.out.println(getRencana2());
        setRencana3("kursus");
        System.out.println(getRencana3());
    }

    public static void main(String[] args){

        memberParent1();
    }
}
