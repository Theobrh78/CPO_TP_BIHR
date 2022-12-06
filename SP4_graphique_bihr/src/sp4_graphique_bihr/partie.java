package sp4_graphique_bihr;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    private joueur joueurSuivant;
    private PlateauDeJeu plateau;

    public partie(joueur J1, joueur J2) {
        listeJoueurs[0]=J1;
        listeJoueurs[1]=J2;
        plateau = new PlateauDeJeu();
    }    
    
    
    public void attribuerCouleurAuxJoueurs(){
       Random r = new Random();
       int a = r.nextInt(1);
       if (a==1){
           listeJoueurs[0].affecterCouleur("rouge");
            System.out.println("le joueur "+ listeJoueurs[0].lirenom() +" a les rouges");
           
            listeJoueurs[1].affecterCouleur("jaune");
           System.out.println("le joueur "+ listeJoueurs[1].lirenom() +" a les jaunes");
       } 
       if (a==0){
           listeJoueurs[1].affecterCouleur("rouge");
           System.out.println("le joueur "+ listeJoueurs[1].lirenom() +" a les rouges");
      
           listeJoueurs[0].affecterCouleur("jaune");
           System.out.println("le joueur "+ listeJoueurs[0].lirenom() +" a les jaunes");
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
        int a = r.nextInt(5);
        Random c = new Random();
        int b = c.nextInt(6);
            if((plateau.presenceTrouNoir(a, b)==false) && (plateau.presenceDesintegrateur(a, b)==false)){
             plateau.placerTrouNoir(a, b);
             plateau.placerDesintegrateur(a, b);
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
        int c = r.nextInt(5);
        Random d = new Random();
        int e = d.nextInt(6);
        if(plateau.presenceTrouNoir(c, e)==false&&plateau.presenceDesintegrateur(c, e)==false){
            plateau.placerTrouNoir(c, e);
            y=y+1;
         }
        }
    }
    
   
    public void initialiserPartie(){
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    }
    
    public void lancerpartie(joueur J1, joueur J2){
        boolean partieencour = true;
        
        int p;
        int i = 0;
        int mode;
        int colonne;
        Jeton jetoncourant;
        while (partieencour==true){
            p=i%2;
            joueurCourant=listeJoueurs[p];
            i=i+1;
  
            System.out.println(listeJoueurs[p].lirenom() +  " peut jouer");
            System.out.println("pour info, voici l'etat de la grille de jeu :");
            plateau.afficherGrilleSurConsole();
            System.out.println("entrez 1 si vous voulez palcer un jeton :");
            Scanner sc=new Scanner(System.in);
            mode = sc.nextInt();
                    
                    if (mode==1){
                        System.out.println("indiquez la colone sur laquelle vous voulez placer un jeton");
                        colonne=sc.nextInt();
                        jetoncourant=joueurCourant.jouerJeton();
                        plateau.ajouterJetonDansColonne(colonne-1, jetoncourant);
                        System.out.println("il vous restes" + joueurCourant.nombreDeJetons() + "jetons");               
                    }
                    if (plateau.coloneGagnantePourCouleur(joueurCourant.lireCouleur())==true||plateau.ligneGagnantePourCouleur(joueurCourant.lireCouleur())==true||plateau.diagonaleDescendanteligneGagnantePourCouleur(joueurCourant.lireCouleur())==true||plateau.diagonaleMontanteGagnantePourCouleur(joueurCourant.lireCouleur())==true){
                       System.out.println("bravo 1" + listeJoueurs[p].lirenom() + " est le vainqueur!");
                        partieencour=false;
                    }
                    
                    
        
                        }
        
    }
    }
