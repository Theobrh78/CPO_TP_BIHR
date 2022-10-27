package com.mycompany.tp2_relation_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;
    public Voiture(String lemod, String lamarque, int Pui) {
     Modele=lemod    ;
     Marque =lamarque;
     PuissanceCV=Pui;
     Proprietaire=null;
     
    }
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = "Modele: " +Modele + ", Marque: " + Marque +", Puisance: " + PuissanceCV +" CV";
    return chaine_a_retourner ;
    }
    
    }

   

