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
    
    public void placerTrousNoirsEtDesintegrateurs(){
        int i=0;
        while (i<3){
        Random r = new Random();
        int a = r.nextInt(6);
        Random c = new Random();
        int b = c.nextInt(7);
            if(plateau.presenceTrouNoir(a, b)==false&&plateau.presenceDesintegrateur(a, b)==false){
             plateau.placerTrouNoir(a-1, b-1);
             plateau.placerDesintegrateur(a-1, b-1);
             i=i+1;
            }
        }
        int j=0;
        while (j<2){
        Random r = new Random();
        int c = r.nextInt(6);
        Random d = new Random();
        int e = d.nextInt(7);
        if(plateau.presenceTrouNoir(c, e)==false&&plateau.presenceDesintegrateur(c, e)==false){
            plateau.placerDesintegrateur(c, e);
            j=j+1;
        }
    }
        int y=0;
        while(y<2){
        Random r = new Random();
        int c = r.nextInt(6);
        Random d = new Random();
        int e = d.nextInt(7);
        if(plateau.presenceTrouNoir(c, e)==false&&plateau.presenceDesintegrateur(c, e)==false){
            plateau.placerTrouNoir(c, e);
            y=y+1;
         }
        }
    }
    
   
    public void initialiserPartie(){
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(joueurCourant);
        placerTrousNoirsEtDesintegrateurs();
    }
    public void lancerpartie(){
        initialiserPartie();
        system.out
    }
 }
