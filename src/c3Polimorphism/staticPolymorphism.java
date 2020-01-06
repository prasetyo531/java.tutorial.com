package c3Polimorphism;

public class staticPolymorphism {

    // method menghitung luas dengan jari-jari
    float luas(float r){
        return (float) (Math.PI * r * r);
    }

    // method menghitung luas dengan diameter
    double luas(double d){
        return (double) (1/4 * Math.PI * d);
    }

    public static void main(String args[]){

        staticPolymorphism n1 = new staticPolymorphism();
        n1.luas(29);

        n1.luas(230.2);
    }
}
