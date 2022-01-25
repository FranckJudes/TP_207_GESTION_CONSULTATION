/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.consultation;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Judes Franck
 */
public class Chargement extends javax.swing.JFrame {

    /**
     * Creates new form Chargement
     */
    public Chargement() {
        initComponents();
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        LoadingName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(204, 255, 255));
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Judes Franck\\Desktop\\f.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -370, 490, 690));
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 590, 0));
        Background.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 490, 940, -1));
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        LoadingName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        LoadingName.setText("Chargement...");
        Background.add(LoadingName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 410, 30));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel5.setText("L'HOSTO");
        jLabel5.setToolTipText("");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 290, 40));

        LoadingValue.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        LoadingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadingValue.setText("0 %");
        Background.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1FocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
   Chargement sp = new Chargement();
   sp.setVisible(true);
   
   
   try{
        for(int i=0 ; i < 100 ; i++){
                Thread.sleep(100);
                     sp.LoadingValue.setText(i +"%");
                            if(i == 10){
                                sp.LoadingName.setText("Ouverture des modules....");
                            }
                            if(i == 20){
                                sp.LoadingName.setText("chargement des modules...");
                            }
                            if(i == 50){
                                sp.LoadingName.setText("Connexion a la BD...");
                            }
                            if(i == 70){
                                sp.LoadingName.setText("Connexion reussi....");
                            }
                            if(i == 90){
                                sp.LoadingName.setText("Lancement du Logiciel...");
                            }
                            sp.LoadingBar.setValue(i);

        
        }
   }catch(Exception e){
       
   }
   
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingName;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
