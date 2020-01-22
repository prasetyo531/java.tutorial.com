package c2StaticNonStaticFinal;

public class childOverridingStaticNon extends parentOverridingStaticNon {

    void gerobak(){

        String ciri = "4 kaca";
        System.out.println(ciri);
    }

    public static void main(String[] args){

        parentOverridingStaticNon m = new parentOverridingStaticNon();
        m.gerobak();


        childOverridingStaticNon n = new childOverridingStaticNon();
        n.gerobak();
    }
}
