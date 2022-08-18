package org.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appart {
    @Id
    private String noAppart;
    private String noImmeuble;
    private int nbPieces;
    private float prix;
    private float surface;

    public Appart() {
    }

    public Appart(String noAppart, String noImmeuble, int nbPieces, float prix, float surface) {
        this.noAppart = noAppart;
        this.noImmeuble = noImmeuble;
        this.nbPieces = nbPieces;
        this.prix = prix;
        this.surface = surface;
    }

    public String getNoAppart() {
        return noAppart;
    }

    public void setNoAppart(String noAppart) {
        this.noAppart = noAppart;
    }

    public String getNoImmeuble() {
        return noImmeuble;
    }

    public void setNoImmeuble(String noImmeuble) {
        this.noImmeuble = noImmeuble;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }
}
