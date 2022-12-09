package sp4_graphique_bihr;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

public class Jeton {
    private String couleur;
    public Jeton(String couleur) {
        this.couleur = couleur;
    }

    public String lireCouleur() {
        return couleur;
    }  
    
@Override 
    public String toString() {
    String C="";
    String chaine_a_retourner;
    if (couleur=="rouge"){
    C="R";  
    }
    if (couleur=="jaune"){
    C="J";    
    }
    chaine_a_retourner = "Couleur du Jeton: " + C ;
    return chaine_a_retourner;
    }
       
}


