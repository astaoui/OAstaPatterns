package creationalPattern.factoryPattern;

/**
 * Created by medasta on 03/11/2016.
 */
public class Factory {
    public static final int TYPE_PRODUIT1=1;
    public static final int TYPE_PRODUIT2=2;

    public Factory() {
    }

    public Produit getProduit(int typeProduit){
        switch (typeProduit){
            case TYPE_PRODUIT1:
                return new Produit1();
            case TYPE_PRODUIT2:
                return new Produit2();
            default:
                throw new IllegalArgumentException("Type erroné");
        }
    }
}
