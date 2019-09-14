package chapter9c;

public class testOverriding {

    public static void main(String[] args){

        rectangle hitungpersegi = new rectangle();
        square hitungkotalk = new square();

        //print overring method
        System.out.println(hitungpersegi.calculatePerimeter());
        System.out.println(hitungkotalk.calculatePerimeter());

    }
}
