package creational.abstractfactory;

/**
 * Created by medasta on 03/11/2016.
 */
public class ProduitFactory2 implements IFactoryProduit  {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}
