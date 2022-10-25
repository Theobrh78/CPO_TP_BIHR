/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_bihr;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TP2_convertisseurObjet_BIHR {

    public static void main(String[] args) {
        double Tempconverti;            //cette variable represente la valeur finale converti
        int nbconv =0;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, donnez le uniquement chiffre de la temperature que voulez vous convertir ?");
        int temperature = sc.nextInt();     //l'utilisateur rentre la valeur de sa temperature
        Convertisseur jardin = new Convertisseur();
        
        sc.nextLine();
        
        System.out.println(" Donnez d'abord l'unité de votre temperature. Vous choisissez entre Celcuis, Kelvin et Farhenheit");
        
        String UniteD = sc.nextLine();          //l'utilisateur definit l'unité de sa temperature
        System.out.println(" En quelle unité voulez vous convertir votre temperature. Vous choisissez entre Celcuis, Kelvin et Farhenheit ");
        String UniteF = sc.nextLine();         //il donne l'instruction de l'unité finale(UnitéF, et UnitéD = unité de depart)
        if ("Kelvin".equals(UniteD)) {
            double tKelvin = temperature;
            if ("Celcius".equals(UniteF)) {
                Tempconverti = jardin.KelvinCelcuis(tKelvin);           //on appele le convertisseur
                System.out.println("votre valeur est : " + Tempconverti + "°C");
            }
            if ("Farhenheit".equals(UniteF)) {
                Tempconverti = jardin.KelvinFar(tKelvin);
                System.out.println("votre valeur est : " + Tempconverti + "F"); //affichage de la valeur converti avec l'unité
            }
        }
        if ("Celcius".equals(UniteD)) {         //on traite le cas où l'unité de la valeur d'entrée est le Celcius
            double tCelcius = temperature;
            if ("Kelvin".equals(UniteF)) {
                Tempconverti = jardin.CelsuisKelvin(tCelcius);
                System.out.println("votre valeur est : " + Tempconverti + "K");
            }
            if ("Farhenheit".equals(UniteF)) {
                Tempconverti = jardin.CelcuisFar(tCelcius);
                System.out.println("votre valeur est : " + Tempconverti + "F");
            }
        }
        if ("Farhenheit".equals(UniteD)) {
            double tFar = temperature;
            if ("Kelvin".equals(UniteF)) {
                Tempconverti = jardin.CelsuisKelvin(tFar);
                System.out.println("votre valeur est : " + Tempconverti + "K");
            }
            if ("Celcius".equals(UniteF)) {
                Tempconverti = jardin.CelcuisFar(tFar);
                System.out.println("votre valeur est : " + Tempconverti + "°C");
            }
        }
        nbconv=nbconv+1;
        System.out.println(nbconv);
    }
}
