package com.mycompany.tp2_relation_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Personne {
    String nom;
    String prenom;
    int nbvoitures;
    Voiture [] liste_voitures ; //on crée un tableau qui repertorie les listes de voitures
    public Personne(String lenom, String leprenom) {
     nom=lenom;
     prenom=leprenom;
     nbvoitures=0;
     liste_voitures = new Voiture [3] ;
    }
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = "Modele: " +nom + ", Marque: " + prenom;
    return chaine_a_retourner ;
    }
}
