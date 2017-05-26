package entities;

import entities.Client;
import entities.Lignecmd;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-25T12:31:32")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Date> date;
    public static volatile SingularAttribute<Commande, Boolean> annulée;
    public static volatile ListAttribute<Commande, Lignecmd> lesLignes;
    public static volatile SingularAttribute<Commande, Client> client;
    public static volatile SingularAttribute<Commande, Long> id;
    public static volatile SingularAttribute<Commande, Boolean> payée;
    public static volatile SingularAttribute<Commande, Boolean> livrée;

}