package udemyVinsguru.functionalInterface;

import java.util.function.Supplier;

public class supplier {

    public static void main(String[] args) {

        Supplier<Double> randomdDoub = () -> Math.random();

        System.out.println(randomdDoub.get());
    }
}
