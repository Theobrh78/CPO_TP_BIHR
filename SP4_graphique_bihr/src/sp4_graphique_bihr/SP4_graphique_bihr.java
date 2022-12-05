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
    String jo="jou1";
    String jol="joull";
    joueur j1 = new joueur(jo);
    joueur j2 = new joueur(jol);
    partie pa = new partie(j1,j2);
    pa.lancerpartie();
    }    
    }
    

