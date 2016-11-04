package creationalPattern.abstractFactoryPattern;

/**
 * Created by medasta on 03/11/2016.
 */
public class Main {
    public static void main(String[] args){

        IFactoryProduit factoryProduit1=new ProduitFactory1();
        IFactoryProduit factoryProduit2=new ProduitFactory2();

        ProduitA produitA=factoryProduit1.getProduitA();
        ProduitB produitB=factoryProduit1.getProduitB();

        System.out.println("--------------- Factory 1 --------------------------");
        produitA.show();
        produitB.show();

         produitA=factoryProduit2.getProduitA();
         produitB=factoryProduit2.getProduitB();

        System.out.println("---------------Factory 2-----------------------------");
        produitA.show();
        produitB.show();

    }
}
