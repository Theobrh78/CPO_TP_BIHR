
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_graphique_bihr;
import java.util.ArrayList;
/**
 *
 * @author User
 */

public class joueur {
    private String joueur;
    private String couleur;
    private ArrayList <Jeton>  reserveJetons = new ArrayList();
    private int nombreDesintegrateurs;
    
    public void setReserveJetons(ArrayList<Jeton> reserveJetons) {
        this.reserveJetons = null;
    }
    
    public joueur(String joueur) {  
        this.joueur = joueur;
        nombreDesintegrateurs=0;
    }

    public void affecterCouleur(String couleur) {
        this.couleur = couleur;
        
    }

    public String lireCouleur() {
        if (couleur=="rouge"){
        return "rouge";
        }
        if (couleur=="jaune"){
            return "jaune";
        }
        return null;
    }
    
    public int nombreDeJetons(){
        int taille = reserveJetons.size();
        return taille;
    }
    public void ajouterJeton(Jeton J){
        reserveJetons.add(J);
    }
    
    public Jeton jouerJeton(){
        Jeton J= reserveJetons.get(0);
        reserveJetons.remove(0);
        return J;
    }
}
