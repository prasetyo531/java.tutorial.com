package accessModifier2;

public class ProductApp {

    public static void main(String[] args) {

        Product product = new Product("website",20000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
