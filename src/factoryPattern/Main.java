package factoryPattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Factory factory = new Factory();
        Produit produitTest = factory.getProduit(Factory.TYPE_PRODUIT1);
        produitTest.show();
        produitTest=factory.getProduit(Factory.TYPE_PRODUIT2);
        produitTest.show();
    }
}




