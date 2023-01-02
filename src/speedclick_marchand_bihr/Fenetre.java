/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package speedclick_marchand_bihr;

import java.awt.Color;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Fenetre extends javax.swing.JFrame {

    /**
     * Creates new form Fenetre
     */
    private matriceDeBoutons matrice;

    public Fenetre() {
        initComponents();
        GrilleDeBoutons.setVisible(false);
        Timer.setVisible(false);
        PanelInfos.setVisible(false);

        String ligne = nbLignes.getText();// on recup le texte donnant le nombre de ligne
        int l = Integer.parseInt(0 + ligne); //on ajoute le zéro afin que le nombre pris en compte par la fonction soit bien un nombre et non du vide quoi qu'il arrive"
        String colonne = nbColonnes.getText();     // on recup le texte donnant le nombre de lignes
        int c = Integer.parseInt(0 + colonne);
        System.out.println(l);

        matriceDeBoutons matriceJeu = new matriceDeBoutons(5, 6);
        Random r = new Random();        //  on en allume un au hasard
        int a = r.nextInt(5);
        Random b = new Random();
        int e = b.nextInt(6);
        
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
                    celluleGraph cell = new celluleGraph(matriceJeu.matrice[i][j]);//(matriceJeu.matrice[i][j]);
                    cell.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) { // Si on clique sur un bouton rouge, il se passe les instruction suivantes grace a un ecouteur
                            Bouton B = cell.bout;
                            infosCourantes.setText("Vous venez de clicker, dépechez vous, clicker sur le prochain boutons");
                            cell.setBackground(Color.WHITE);
                        }
                    });
                    if (i == a && j == e) {
                        GrilleDeBoutons.add(cell);      //aleatoirement, on crée un bouton rouge, tous les autres sont blancu
                        cell.setBackground(Color.RED);
                    } else {
                        GrilleDeBoutons.add(cell);
                        cell.setBackground(Color.WHITE);
                    }
                }
            }
            

        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrilleDeBoutons = new javax.swing.JPanel();
        Timer = new javax.swing.JPanel();
        DebutDePartie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nbLignes = new javax.swing.JTextField();
        nbColonnes = new javax.swing.JTextField();
        Lancer = new javax.swing.JButton();
        PanelInfos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        infos = new javax.swing.JScrollPane();
        infosCourantes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrilleDeBoutons.setBackground(new java.awt.Color(102, 204, 255));
        GrilleDeBoutons.setLayout(new java.awt.GridLayout(6, 5));
        getContentPane().add(GrilleDeBoutons, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 672, 576));

        Timer.setBackground(new java.awt.Color(255, 204, 153));
        Timer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 340, 170));

        DebutDePartie.setBackground(new java.awt.Color(255, 255, 102));
        DebutDePartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Vous venez de lancez une partie !");
        DebutDePartie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 260, 40));

        jLabel2.setText("Pour commencer, indiquez :");
        DebutDePartie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, -1, 24));

        jLabel3.setText("-Le nombre de lignes :");
        DebutDePartie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 96, -1, -1));

        jLabel4.setText("-Le nombre de colonnes:");
        DebutDePartie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        nbLignes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbLignesActionPerformed(evt);
            }
        });
        DebutDePartie.add(nbLignes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 70, 30));

        nbColonnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbColonnesActionPerformed(evt);
            }
        });
        DebutDePartie.add(nbColonnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 70, 30));

        Lancer.setText("Lancez la partie");
        Lancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LancerActionPerformed(evt);
            }
        });
        DebutDePartie.add(Lancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 130, 30));

        getContentPane().add(DebutDePartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 340, 200));

        PanelInfos.setBackground(new java.awt.Color(153, 204, 255));

        jLabel5.setText("pettites infos :");
        PanelInfos.add(jLabel5);

        infosCourantes.setColumns(20);
        infosCourantes.setRows(5);
        infos.setViewportView(infosCourantes);

        PanelInfos.add(infos);

        getContentPane().add(PanelInfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 340, 110));

        setBounds(0, 0, 1127, 839);
    }// </editor-fold>//GEN-END:initComponents

    private void nbColonnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbColonnesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbColonnesActionPerformed

    private void LancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LancerActionPerformed
        Timer.setVisible(true);
        GrilleDeBoutons.setVisible(true);        // TODO add your handling code here:
        PanelInfos.setVisible(true);
    }//GEN-LAST:event_LancerActionPerformed

    private void nbLignesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbLignesActionPerformed

    }//GEN-LAST:event_nbLignesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DebutDePartie;
    private javax.swing.JPanel GrilleDeBoutons;
    private javax.swing.JButton Lancer;
    private javax.swing.JPanel PanelInfos;
    private javax.swing.JPanel Timer;
    private javax.swing.JScrollPane infos;
    private javax.swing.JTextArea infosCourantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nbColonnes;
    private javax.swing.JTextField nbLignes;
    // End of variables declaration//GEN-END:variables
}