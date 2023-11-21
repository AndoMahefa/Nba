package vehicules.ressources.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StatistiqueSaison {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_joueur;
    String nom_joueur;
    int matchs_joues;
    double ppms;
    double rpms;
    double pdpms;
    double mpms;
    double effs;
    double fgs;
    double threeps;
    double lfs;

    
    public StatistiqueSaison(){

    }

    public int getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }

    public double getPpms() {
        return ppms;
    }

    public void setPpms(double ppms) {
        this.ppms = ppms;
    }

    public double getRpms() {
        return rpms;
    }

    public void setRpms(double rpms) {
        this.rpms = rpms;
    }

    public double getPdpms() {
        return pdpms;
    }

    public void setPdpms(double pdpms) {
        this.pdpms = pdpms;
    }

    public double getMpms() {
        return mpms;
    }

    public void setMpms(double mpms) {
        this.mpms = mpms;
    }

    public double getEffs() {
        return effs;
    }

    public void setEffs(double effs) {
        this.effs = effs;
    }

    public double getFgs() {
        return fgs;
    }

    public void setFgs(double fgs) {
        this.fgs = fgs;
    }

    public double getThreeps() {
        return threeps;
    }

    public void setThreeps(double threeps) {
        this.threeps = threeps;
    }

    public double getLfs() {
        return lfs;
    }

    public void setLfs(double lfs) {
        this.lfs = lfs;
    }

    public int getMatchs_joues() {
        return matchs_joues;
    }

    public void setMatchs_joues(int matchs_joues) {
        this.matchs_joues = matchs_joues;
    }

    public String getNom_joueur() {
        return nom_joueur;
    }

    public void setNom_joueur(String nom_joueur) {
        this.nom_joueur = nom_joueur;
    }

    

    
}
