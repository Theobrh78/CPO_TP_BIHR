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
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel temperature voulez vous convertir ?");
        int temperature = sc.nextInt();     //l'utilisateur rentre la valeur de sa temperature
        Convertisseur jardin = new Convertisseur();
        System.out.println(" Donnez d'abord l'unité de votre temperature ");
        String UnitéD = sc.nextLine();          //l'utilisateur definit l'unité de sa temperature
        System.out.println(" Donnez l'unité de la valeur que vous voulez convertir ");
        String UnitéF = sc.nextLine();         //il donne l'instruction de l'unité finale(UnitéF, et UnitéD = unité de depart)
    }
}
