package entities;

import entities.Lignecmd;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-25T12:31:32")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, Float> prixUnitaire;
    public static volatile SingularAttribute<Produit, String> libelle;
    public static volatile ListAttribute<Produit, Lignecmd> lesLignecmd;
    public static volatile SingularAttribute<Produit, Long> id;
    public static volatile SingularAttribute<Produit, Integer> stock;
    public static volatile SingularAttribute<Produit, String> descriptif;

}