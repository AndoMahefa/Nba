package vehicules.ressources.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Saison {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idSaison;
    String dateSaison;

    public Saison(){

    }

    public int getIdSaison() {
        return idSaison;
    }

    public void setIdSaison(int idSaison) {
        this.idSaison = idSaison;
    }

    public String getDateSaison() {
        return dateSaison;
    }

    public void setDateSaison(String dateSaison) {
        this.dateSaison = dateSaison;
    }
    
}
