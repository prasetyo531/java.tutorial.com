package udemyVinsguru;

public class testAnimal {

    public static void main(String[] args) {

        //cara manggil 1 class yg sama
        buaya b = new buaya();
        harimau h = new harimau();

        b.membelaDiri();
        h.membelaDiri();

        //cara manggil 2 by parameter
        testAnimal t = new testAnimal();
        t.callSubClass(b);
        t.callSubClass(h);

        //cara manggil 3 by create instance
        animal a = new ular();
        a.bergerak();
        a.membelaDiri();
        a.warna();
    }

    public void callSubClass(animal a){

        a.bergerak();
        a.membelaDiri();
        a.warna();
    }
}
