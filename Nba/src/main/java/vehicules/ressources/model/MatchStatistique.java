package vehicules.ressources.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MatchStatistique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idStatistique;
    int id_joueur;
    int id_match;
    double ppm;
    double rpm;
    double pdpm;
    double mpm;
    double eff;
    double fg;
    double threep;
    double lf;

    public MatchStatistique(){

    }

    public int getIdStatistique() {
        return idStatistique;
    }

    public void setIdStatistique(int idStatistique) {
        this.idStatistique = idStatistique;
    }

    public int getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }

    public int getId_match() {
        return id_match;
    }

    public void setId_match(int id_match) {
        this.id_match = id_match;
    }

    public double getPpm() {
        return ppm;
    }

    public void setPpm(double ppm) {
        this.ppm = ppm;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public double getPdpm() {
        return pdpm;
    }

    public void setPdpm(double pdpm) {
        this.pdpm = pdpm;
    }

    public double getMpm() {
        return mpm;
    }

    public void setMpm(double mpm) {
        this.mpm = mpm;
    }

    public double getEff() {
        return eff;
    }

    public void setEff(double eff) {
        this.eff = eff;
    }

    public double getFg() {
        return fg;
    }

    public void setFg(double fg) {
        this.fg = fg;
    }

    public double getThreep() {
        return threep;
    }

    public void setThreep(double threep) {
        this.threep = threep;
    }

    public double getLf() {
        return lf;
    }

    public void setLf(double lf) {
        this.lf = lf;
    }

    

}
