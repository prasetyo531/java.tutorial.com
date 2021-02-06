package testautomationu;

public class testAbstraction {

    public static void main(String[] args){

        shape rec = new rectangle(50,20);
        rec.print();
        System.out.println(rec.calculate());
    }
}
