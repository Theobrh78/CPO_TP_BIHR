/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_graphique_bihr;

/**
 *
 * @author User
 */
public class PlateauDeJeu {
    CelluleDeGrille grille[][];

    public void PlateauDeJeu() {
        this.grille = grille;
        
        for (int i = 0; i<6; i++){
            for(int j=0; j<7; j++){
                grille[i][j]=new CelluleDeGrille();
            }
        }
    }
    public int ajouterJetonDansColonne(Jeton Jet, int Co){
        int numeroligne=0;
        for (int L = 0; L<6 ; L++){
            if  (grille[L][Co].presenceJeton()==true) {
                numeroligne = numeroligne+1 ;
                        }
            else {
               grille[L][Co].affecterJeton();
            }
        }
        return numeroligne;
    }

    public boolean grilleRemplie() {
        int numeroligne1=0;
        for (int L = 0; L<6 ; L++){
            for (int i = 0; i<6 ; i++){
            if  (grille[L][i].presenceJeton()==true) {
                numeroligne1 = numeroligne1+1 ;
            }
            }
        }
            if (numeroligne1==6){
                return true;
            }
                   
            else {
                return false;
            }
        
  
    }

   // public CelluleDeGrille[][] viderGrille(Joueur1, Joueur2)() {
      //  return grille;
    //}
    
    public String afficherGrilleSurConsole(){
        for (int x = 0; x<6; x++){
            for(int y=0; y<7; y++){
        System.out.println(" "+ grille[x][y].toString());
        if (x%6==0){
            System.out.println("\n");
        }

            }
        
    }
        return null;
}

    public boolean presenceJeton(int x, int y) {
        if (grille[x][y].presenceJeton()==true){
            return true;
        }
        return false ;
    }
    
    public String lireCouleurDuJeton(int x, int y){
        return grille[x][y].lirecouleurduJeton() ;
    }

    
    public boolean ligneGagnantePourCouleur(String coul){
        int quaad=0;
        for (int i = 0;  i<6; i++){
            for(int j=0; j<7; j++){
                if (grille[j][i].lirecouleurduJeton()== coul){
                  quaad=quaad+1;
                  if (quaad==4){
                      return true;
                  }
                }
                else {
                       quaad=0;   
                          }  
                }      
        }
    return false;
    }
    
    public boolean coloneGagnantePourCouleur(String coul){
        int quaad=0;
        for (int i = 0;  i<7; i++){
            for(int j=0; j<6; j++){
                if (grille[i][j].lirecouleurduJeton()== coul){
                  quaad=quaad+1;
                  if (quaad==4){
                      return true;
                  }
                }
                else {
                       quaad=0;   
                          }  
                }      
        }
    return false;
    }
    
    public boolean diagonaleMontanteGagnantePourCouleur(String coul){
        
        return false;
        
    }
    
    public boolean diagonaleDesencanteGagnantePourCouleur(String coul){
        
        return false;
        
    }
    
    
    public boolean getGrilleetreGagnantePourCouleur(){
        return true;
    }

    public void tasserColonne(int numcolone){
        for (int i=0; i<6; i++){
            if(i!=0){
            grille[i-1][numcolone]=grille[i][numcolone];
                    }
        }
    }
     public boolean colonneRemplie(int numcolone){
         int temp=0;
         for (int i=0; i<6; i++){
             if (grille[i][numcolone].presenceJeton()==true){
                 temp+=1;
             }
         }
             if (temp==6){
                 return true;           
         }
             return false;
     }    

    public void supprimerJeton(int x, int y) {
        grille[x][y].supprimerJeton();
    }
    
    public void recupererJeton(int x, int y){
        grille[x][y].recupererJeton();
    }
    
    
}

