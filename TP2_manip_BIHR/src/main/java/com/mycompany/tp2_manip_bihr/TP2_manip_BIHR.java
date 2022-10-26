/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_manip_bihr;

/**
 *
 * @author User
 */
public class TP2_manip_BIHR {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;          //deux tartiflettes sont crées 
        Tartiflette assiette3 = assiette2 ;                          //assiette3 et assiette2 referencent la meme tartiflette                             
            System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
            System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        assiette2=assiette1;
        assiette1=assiette3;
        
                //Moussaka assiette666 = assiette1 ;            ces deux lignes sont fausses
                //Moussaka assiette667 = new Tartiflette() ;    Un objet deja referencé par un type d'objet ne peut donc pas etre assigné a un autre type
    Moussaka [] tabMouss = new Moussaka[10];
    for(int i=0;i<10;i++){                                      //on remplit tabMouss par des valeurs en fonction de i et Moussaka qui represente le nb de calories
        tabMouss[i]=new Moussaka(i);
    }
    }
}
