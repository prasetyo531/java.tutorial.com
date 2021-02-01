package c3Polimorphism;

public class polymorphism {

    public static void main(String[] args) {
        person p = new person();
        p.setGender("perempuan");
        System.out.println(p.getGender());

        //parent to child
        person w = new employee();
        w.who("ninda");
    }
}
