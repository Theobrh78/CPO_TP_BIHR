/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_relation_1;

/**
 *
 * @author User
 */
public class TP2_relation_1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        //en exucutant, on recupere les bonnes données
        
        bob.liste_voitures[0] = uneClio ;
    bob.nbvoitures = 1 ;
    uneClio.Proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ) ; //on recupere bien en executant :la premiere voiture de Bob est Modele: Clio, Marque: Renault, Puisance: 5 CV

    }
}
