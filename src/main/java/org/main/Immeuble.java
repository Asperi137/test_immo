package org.main;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Immeuble {
    @Id
    private String noImm;
    private String adresse;
    private String ville;
    private ArrayList<Appart> lstAppart;

    public Immeuble() {
    }

    public Immeuble(String noImm, String adresse, String ville) {
        this.noImm = noImm;
        this.adresse = adresse;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Immeuble : " +
                       "noImmeuble='" + noImm + '\'' +
                       ", adresse='" + adresse + '\'' +
                       ", ville='" + ville + '\'';
    }

    public String getNoImm() {
        return noImm;
    }

    public void setNoImm(String noImm) {
        this.noImm = noImm;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public ArrayList<Appart> getLstAppart() {
        return lstAppart;
    }

    public void setLstAppart(ArrayList<Appart> lstAppart) {
        this.lstAppart = lstAppart;
    }
}
