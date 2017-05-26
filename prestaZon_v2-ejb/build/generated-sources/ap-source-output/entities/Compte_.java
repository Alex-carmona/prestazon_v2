package entities;

import entities.Client;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-25T12:31:32")
@StaticMetamodel(Compte.class)
public class Compte_ { 

    public static volatile SingularAttribute<Compte, Float> solde;
    public static volatile SingularAttribute<Compte, Client> client;
    public static volatile SingularAttribute<Compte, Long> id;

}