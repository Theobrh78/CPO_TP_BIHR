package sp4_graphique_bihr;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class partie {
    private joueur listeJoueurs[] = new joueur[2];
    private joueur joueurCourant;
    private PlateauDeJeu plateau;

    public partie(joueur J1, joueur J2) {
        listeJoueurs[0]=J1;
        listeJoueurs[1]=J2;
        plateau = new PlateauDeJeu();
    }    
    
    
    public void attribuerCouleurAuxJoueurs(){
       Random r = new Random();
       int a = r.nextInt(2);
       if (a==1){
           listeJoueurs[0].affecterCouleur("rouge");
       }
       else {
           listeJoueurs[1].affecterCouleur("jaune");
           
       } 
       if (a==2){
           listeJoueurs[1].affecterCouleur("rouge");
       }
       else {
           listeJoueurs[0].affecterCouleur("jaune");
    }
    }
    
    public void creerEtAffecterJeton(joueur J){
        for (int i=0 ; i<30; i++){
        J.ajouterJeton(new Jeton (J.lireCouleur()));
        }
    }
    
}
