
import Armes.epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author User
 */
public class TP_BIHR_Théophile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    epee Ex = new epee("Excalibure", 7, 5);
    epee Du = new epee("Durandal", 4, 7);
    
    Baton Ch = new Baton ("Chene",4,5);
    Baton Cha = new Baton ("Charme",5,6);
    
    ArrayList <Arme> Tab = new ArrayList ();
    Tab.add(Ex);
    Tab.add(Du);
    Tab.add(Ch);
    Tab.add(Cha);
    
    int taille = Tab.size();
    for (int i=0; i<taille; i++ ){
        System.out.println(Tab.get(i));
    }
    
    }   
}
