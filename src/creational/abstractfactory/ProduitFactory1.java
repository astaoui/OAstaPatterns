package creational.abstractfactory;

/**
 * Created by medasta on 03/11/2016.
 */
public class ProduitFactory1 implements IFactoryProduit {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
