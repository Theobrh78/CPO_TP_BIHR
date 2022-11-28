/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_graphique_bihr;

/**
 *
 * @author User
 */
public class CelluleDeGrille {
    private Jeton   jetonCourant;
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;

    public CelluleDeGrille() {
        this.jetonCourant = null;
    }

    public boolean presenceJeton() {
        if (jetonCourant==null){
            return false;
        }
        else
            return true;
    }

    public void affecterJeton() {
        this.jetonCourant = jetonCourant;
    }

    public String lirecouleurduJeton() {
        if (jetonCourant == null){
            return "vide";
        }
        else {
            return jetonCourant.lireCouleur();
        }
    }
    
      
    

    public void placerTrouNoir() {
        this.avoirTrouNoir = true;
    }

    public void supprimerTrouNoir() {
        this.avoirTrouNoir = false;
    }

    public boolean presenceTrouNoir() {
        if (avoirTrouNoir==true){
            return true;
        }
        else {return false;} 
    }
    
    public Jeton recupererJeton(){
        Jeton tempJ=jetonCourant;
        jetonCourant=null;
        return tempJ;
    }
    
    public void supprimerJeton(){
        jetonCourant=null;
    }

    public boolean presenceDesintegrateur() {
        if (avoirDesintegrateur==true){
            return true;
        }
        else {return false;} 
        
    }

    public void placerDesintegrateur() {
        this.avoirDesintegrateur = true;
    }

    public void supprimerDesintegrateur() {
        this.avoirDesintegrateur = false;
    }

    public void activerTrouNoir() {
        supprimerTrouNoir();
        supprimerJeton();
    }
    
@Override
    public String toString(){
        if (presenceJeton()==true){
             if (jetonCourant.lireCouleur()=="rouge"){
                 return "R";
             if (jetonCourant.lireCouleur()=="jaune"){ 
                 return "J";
             }   
        if (presenceTrouNoir()==true){
          return "@"  
        }
        if (presenceDesintegrateur()==true){
            return "D"
        }
        else{ return"";)
    }
        
        
 }   


