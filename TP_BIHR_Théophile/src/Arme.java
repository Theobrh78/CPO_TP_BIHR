/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Arme {
    String nom ;
    int LvLattaque;
        public Arme(String n, int i ){
            nom=n;
            LvLattaque=i;
            
        }
@Override 
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = "Nom de l'arme: " + nom + "niveau attaque"+ LvLattaque ;
    return chaine_a_retourner;
    }
    
}
