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
       int a = r.nextInt(2);
       if (a==1){
           listeJoueurs[0].affecterCouleur("rouge");
            System.out.println("le joueur"+listeJoueurs[0]+"a les rouges");
       }
       else {
           listeJoueurs[1].affecterCouleur("jaune");
           System.out.println("le joueur"+listeJoueurs[1]+"a les jaunes");
       } 
       if (a==2){
           listeJoueurs[1].affecterCouleur("rouge");
           System.out.println("le joueur"+listeJoueurs[1]+"a les rouges");
       }
       else {
           listeJoueurs[0].affecterCouleur("jaune");
           System.out.println("le joueur"+listeJoueurs[0]+"a les jaunes");
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
    joueurCourant = listeJoueurs[0];//le joueur classé en premier comence
        joueurSuivant = listeJoueurs[1];
        boolean finito = false;
        while (finito == false) { //tant que la partie n'est pas finie
            Scanner sc;
            int colonneJouee;
            int choixJoueur;
            sc = new Scanner(System.in);
            plateau.afficherGrilleSurConsole();
            if (joueurCourant == listeJoueurs[0]) {
                joueurSuivant = listeJoueurs[1];
            } else if (joueurCourant == listeJoueurs[1]) {
                joueurSuivant = listeJoueurs[0];//on inverse le joueur courant
            }
            System.out.println("Au tour de " + joueurCourant + " (couleur " + joueurCourant.lireCouleur() + ")");
            

            choixJoueur = 99;   
            while (choixJoueur != 1 && choixJoueur != 2 && choixJoueur != 3) { //tant que le choix du joueur n'est pas valide
                System.out.println("Que voulez vous faire?");
                System.out.println("Placer un jeton (1), en recuperer un (2) ou jouer un desintegrateur (3)?");
                choixJoueur = sc.nextInt();
            }
        ArrayList<Jeton> reserveJetons;

            while (choixJoueur == 2 && joueurCourant.setReserveJetons(reserveJetons).size() == 30) {
                System.out.println("Vous n'avez pas de jeton a retirer");
                System.out.println("Que voulez vous faire?");
                System.out.println("Placer un jeton (1), en recuperer un (2) ou jouer un desintegrateur (3)?");
                choixJoueur = sc.nextInt();
            }

            while (choixJoueur == 3 && joueurCourant.getNombreDesintegrateurs() == 0) {
                System.out.println("Vous n'avez pas de desintegrateur. Gros chien");
                System.out.println("Que voulez vous faire?");
                System.out.println("Placer un jeton (1), en recuperer un (2) ou jouer un desintegrateur (3)?");
                choixJoueur = sc.nextInt();

            }

///si le joueur joue un jeton

            if (choixJoueur == 1) {
                System.out.println("Sur quelle colonne voulez-vous jouer? (1 a 7)");
                colonneJouee = sc.nextInt(); //saisie sur l'interface
                while ((colonneJouee <= 0) || (colonneJouee >= 8)) {  //tant que l'utilisateur comprend que dalle, on lui redemande
                    System.out.println("Sur quelle colonne voulez-vous jouer? (1 a 7)");
                    colonneJouee = sc.nextInt();
                }

                int ligneJouee;
                ligneJouee = plateau.ajouterJetonDansColonne(joueurCourant.getReserveJetons().get(0), colonneJouee - 1);
                while (ligneJouee == 99) { //tant que le joueur joue sur une colonne pleine, on lui demande de rejouer
                    System.out.println("Erreur: la colonne est pleine");
                    System.out.println("Sur quelle colonne voulez-vous jouer? (1 a 7)");
                    colonneJouee = sc.nextInt(); //saisie sur l'interface
                    ligneJouee = plateau.ajouterJetonDansColonne(joueurCourant.getReserveJetons().get(0), colonneJouee - 1);
                }
                if (plateau.presenceTrouNoir(ligneJouee, colonneJouee - 1)) {//si le joueur a joue dans un trou noir
                    plateau.supprimerJeton(ligneJouee, colonneJouee - 1);
                    plateau.supprimerTrouNoir(ligneJouee, colonneJouee - 1);
                    System.out.println("Jeton mange par un trou noir. Cheh.");
                }
                if (plateau.presenceDesintegrateur(ligneJouee, colonneJouee - 1)) {
                    plateau.supprimerDesintegrateur(ligneJouee, colonneJouee - 1);
                    joueurCourant.obtenirDesintegrateur();
                    System.out.println("Vous avez recupere un desintagrateur");
                }
                System.out.println("Pion place");
                joueurCourant.jouerJeton();//si le colonne n'est pas pleine, on enleve le jeton place de la reserve du joueur
            }
/// si le joueur recupere un jeton
            if (choixJoueur == 2) {
                int ligneJouee;
                System.out.println("Sur quelle colonne est le jeton que vous voulez enlever?");
                colonneJouee = sc.nextInt();
                System.out.println("Sur quelle ligne est le jeton que vous voulez recuperer?");
                ligneJouee = sc.nextInt();
                while (plateau.lireCouleurJeton(ligneJouee - 1, colonneJouee - 1) != joueurCourant.getCouleur()) { //tant que le joueur ne joue pas sur un jeton qu'il possede
                    System.out.println("Il n'y a pas de jeton a vous sur  cette case.");
                    System.out.println("Sur quelle colonne est le jeton que vous voulez enlever?");
                    colonneJouee = sc.nextInt();
                    System.out.println("Sur quelle ligne est le jeton que vous voulez recuperer?");
                    ligneJouee = sc.nextInt();
                }
                joueurCourant.ajouterJeton(plateau.recupererJeton(ligneJouee - 1, colonneJouee - 1)); //on enleve le jeton et on le redonne au joueur
                    plateau.tasserColonne(colonneJouee - 1);
            }
/// si le joueur joue un desintegrateur
            if (choixJoueur == 3) {
                int ligneDesint;
                System.out.println("Sur quelle colonne est le jeton que vous voulez desintegrer?");
                colonneJouee = sc.nextInt();
                System.out.println("Sur quelle ligne est le jeton que vous voulez desintegrer?");
                ligneDesint = sc.nextInt();
                while (plateau.lireCouleurJeton(ligneDesint - 1, colonneJouee - 1) != joueurSuivant.getCouleur()) {
                    System.out.println("Il n'y a pas de jeton advesre sur  cette case.");
                    System.out.println("Sur quelle colonne est le jeton que vous voulez desintegrer?");
                    colonneJouee = sc.nextInt();
                    System.out.println("Sur quelle ligne est le jeton que vous voulez desintegrer?");
                    ligneDesint = sc.nextInt();
                }
                plateau.supprimerJeton(ligneDesint-1, colonneJouee-1);
                joueurCourant.utiliserDesintegrateur();
                plateau.tasserColonne(colonneJouee-1);
            }
///

            if (plateau.etreGagnantePourCouleur(joueurSuivant.getCouleur())) { //on verifie que la victoire ne revienne pas a l'autre joueur suit un la suppression d'un jeton
                System.out.println("Felicitations, le joueur " + joueurSuivant + " a gagne");
                finito = true;
                plateau.afficherGrilleSurConsole();
            } else if (plateau.etreGagnantePourCouleur(joueurCourant.getCouleur())) {
                finito = true;
                plateau.afficherGrilleSurConsole();
                System.out.println("Felicitations, le joueur " + joueurCourant + " a gagne");
            }
            if (plateau.grilleRemplie()) {
                System.out.println("La grille est pleine: fin de partie");
                finito = true;
            }
            joueurCourant = joueurSuivant;
        }
 }
