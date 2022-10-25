/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Convertisseur {
    int nbconv=0;         // compte le nb de conversion
    double tKelvin;     //on initialise toutes les varibles correspondant aix temperatures
    double tCelcuis;
    double tFar;        //tFar=tFarehnheit
    
   
    public Convertisseur() {      
            nbconv=0 ;              //on inistialise le nb de conv a 0
            
        }
        
public double CelsuisKelvin (double tCelcuis){
    tKelvin=tCelcuis + 273;   
    nbconv+=1;                          //conversion de celcuis en kelvin
    return tKelvin ;
    
}
public double KelvinCelcuis (double tKelvin){
    tCelcuis=tKelvin - 273;
    nbconv+=1;                          // conversion de kelvin en celcuis
    return tCelcuis;
}
public double FarCelcuis(double tFar){
    tCelcuis=(tFar-32)/1.8;
    nbconv+=1;                          //le +1 permet comme a chaque methode de conversion d'ajouter une conversion au nombre de conversion
    return tCelcuis;
}
public double CelcuisFar(double tCelcuis){
    tFar=(tCelcuis*1.8)+32;
    nbconv+=1;  
    return tFar;
}
public double KelvinFar(double tKelvin){
    tFar=(tKelvin-273)*1.8+32 ; 
    nbconv+=1;
    return tFar;                    //conversion de kelvin en farhenheit
}
public double FarKelvin(double tFar){
    tKelvin=(tFar-32)*5/9 +32;
    nbconv+=1;
    return tKelvin;
}
@Override
public String toString () {
 return "nb de conversions"+ nbconv;
}
}
