/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_graphique_bihr;

/**
 *
 * @author User
 */
public class SP4_graphique_bihr {
    public static void main(String[] args){
    joueur j1 = new joueur("Theo");
    joueur j2 = new joueur("Emilien");
    
    partie pa = new partie(j1,j2);
    pa.initialiserPartie();
    pa.lancerpartie(j1,j2);
    }    
    }
    

