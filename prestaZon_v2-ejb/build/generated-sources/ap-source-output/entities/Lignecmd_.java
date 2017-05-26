package entities;

import entities.Commande;
import entities.Produit;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-25T12:31:32")
@StaticMetamodel(Lignecmd.class)
public class Lignecmd_ { 

    public static volatile SingularAttribute<Lignecmd, Produit> produit;
    public static volatile SingularAttribute<Lignecmd, Long> id;
    public static volatile SingularAttribute<Lignecmd, Commande> commande;
    public static volatile SingularAttribute<Lignecmd, Long> quantite;

}