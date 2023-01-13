package com.objet;

public class Objet {
    String nom;
    int prix;
    int valeur;

    public Objet(String nom, int prix, int valeur) {
        this.nom = nom;
        this.prix = prix;
        this.valeur = valeur;
    }

    public String getName(){
        return nom;
    }
    public int getPrice(){
        return prix;
    }
    public int getValue(){
        return valeur;
    }

}
