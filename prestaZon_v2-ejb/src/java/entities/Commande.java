/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Alex
 */
@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    @OneToMany
     private ArrayList<Lignecmd> lesLignes;
    @ManyToOne
    private Client client;
    private boolean annulée;
    private boolean livrée;
    private boolean payée;

    public Date getDate() {
        return date;
    }

    public Commande(Date date, ArrayList<Lignecmd> lesLignes, Client client, boolean annulée, boolean livrée, boolean payée) {
        this.date = date;
        this.lesLignes = lesLignes;
        this.client = client;
        this.annulée = false;
        this.livrée = false;
        this.payée = false;
    }

   

    public boolean contains(Object o) {
        return lesLignes.contains(o);
    }

    public Lignecmd get(int index) {
        return lesLignes.get(index);
    }

    public void add(int index, Lignecmd element) {
        lesLignes.add(index, element);
    }

    public void clear() {
        lesLignes.clear();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Lignecmd> getLesLignes() {
        return lesLignes;
    }

    public void setLesLignes(ArrayList<Lignecmd> lesLignes) {
        this.lesLignes = lesLignes;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isPayée() {
        return payée;
    }

    public void setPayée(boolean payée) {
        this.payée = payée;
    }

    

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Commande[ id=" + id + " ]";
    }
    
}
