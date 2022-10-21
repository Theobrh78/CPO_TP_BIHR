/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_bihr;

/**
 *
 * @author User
 */
public class TP2_Bieres_BIHR {

    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "rince cochon";
        uneBiere.degreAlcool = 65 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
           uneBiere.lireEtiquette();
           
        BouteilleBiere uneBiere1 = new BouteilleBiere() ;
        uneBiere1.nom = "Leffe";
        uneBiere1.degreAlcool = 6.6 ;
        uneBiere1.brasserie = "Abbaye de Leffe";
        uneBiere1.ouverte = false;
           uneBiere1.lireEtiquette();   
    }
    
}

