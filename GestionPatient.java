/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.consultation;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Judes Franck
 */
public class GestionPatient extends javax.swing.JFrame {
    int id;
    Connection conn = null;
    PreparedStatement pst;
    ResultSet rs;
    
     
     
     public static Connection connection(){
          Connection conn = null;
		try{
                            Class.forName("org.postgresql.Driver");                         
			        String url = "jdbc:postgresql://localhost:5432/bd";      
				String user = "postgres"; 
				String passwd = "root";
				 conn = DriverManager.getConnection(url, user, passwd);      
		    } catch (Exception e) {      
			       e.printStackTrace();           
		} 
                return conn;
    }
    public GestionPatient(int id_pat) throws SQLException {
        initComponents();
        M.setSelected(true);
        id = id_pat;
        age.setVisible(false);
        M.setVisible(false);
        F.setVisible(false);
        ageL.setVisible(false);
        sexeL.setVisible(false);
        nom.setVisible(false);
        nomL.setVisible(false);
        
         String sql ="SELECT * FROM public.symptomes WHERE id_patient = "+id;
            Connection con = connection(); 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel def = (DefaultTableModel) table.getModel();
            
            while(rs.next()){
                
                String nom = rs.getString(2);
                String symp = rs.getString(3);
                String date = rs.getString(4);
                int age = rs.getInt(5);
                String sexe = rs.getString(6);
                String statut = rs.getString(7);
                int id = rs.getInt(8);
                int id_patient = rs.getInt(1);
                String details = rs.getString(9);
              Object[] item = {nom,symp,date,statut,age,sexe,details};
              def.addRow(item);
                
            }
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        ageL = new javax.swing.JLabel();
        symptome = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        sexeL = new javax.swing.JLabel();
        M = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        qui = new javax.swing.JComboBox<>();
        nomL = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        age = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" PATIENTS");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jButton1.setText("AJOUTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jButton2.setText("SUPPRIMER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jButton3.setText("MODIFIER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setText("Fermer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        table.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Symptome", "Date_RDV", "Statut", "Age", "Sexe", "Détails"
            }
        ));
        table.setRowHeight(26);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setText("Syntome    : ");

        ageL.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        ageL.setText("Age          :");

        symptome.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        symptome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maux de :---------------------", "Tete", "Gorge", "Ventre", "Coeur", "Membres", "Autres...." }));
        symptome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setText("Détails      : ");

        details.setColumns(20);
        details.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        details.setRows(5);
        details.setText(" ");
        jScrollPane1.setViewportView(details);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setText("Nettoyer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        sexeL.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        sexeL.setText("Sexe         :");

        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        qui.setFont(new java.awt.Font("Viner Hand ITC", 2, 24)); // NOI18N
        qui.setForeground(new java.awt.Color(153, 153, 153));
        qui.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Se faire consulter", "Consulter une autre personne" }));
        qui.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        qui.setDoubleBuffered(true);
        qui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiActionPerformed(evt);
            }
        });

        nomL.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        nomL.setText(" Nom        :");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ageL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexeL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomL, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(symptome, javax.swing.GroupLayout.Alignment.TRAILING, 0, 388, Short.MAX_VALUE)
                    .addComponent(nom)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(M)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(F))
                    .addComponent(age)
                    .addComponent(qui, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(qui, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomL, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(nom))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(symptome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ageL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(age)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sexeL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M)
                            .addComponent(F))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(947, 675));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
     
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
          Connection conn = connection();
          
          String sql = "SELECT nom, prenom, sexe, age \n" +
"	FROM public.patient where num_id = "+id;
          
          Connection con = connection(); 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);   
           String nomP = "";
           String sexeP = "";
           int ageP = 0;
           
            if(rs.next()){
                
                 nomP = rs.getString(1)+" "+rs.getString(2);
                 sexeP = rs.getString(3);
                 ageP = rs.getInt(4);                
                
            }
          
          
           pst = conn.prepareStatement("INSERT INTO public.symptomes(\n" +
"	id_patient, nom, symptomes, date, age, sexe, statut, details)\n" +
"	VALUES (?,?,?,?,?,?,?,?);");
           
           
           
           
           
           
           pst.setInt(1,id);
           pst.setString(2,qui.getSelectedIndex() == 0 ? nomP: nom.getText());
           pst.setString(3, (String)symptome.getSelectedItem());
           pst.setString(4, "");
           pst.setInt(5,qui.getSelectedIndex() == 0 ? ageP :Integer.parseInt(age.getText()));
           pst.setString(6, qui.getSelectedIndex() == 0 ? sexeP : M.isSelected()?"Masculin":"Feminin");
           pst.setString(7,"En attente");
           pst.setString(8, details.getText());
           pst.executeUpdate();
           
           DefaultTableModel def = (DefaultTableModel) table.getModel();
            
     
              Object[] item = {qui.getSelectedIndex() == 0 ? nomP: nom.getText(),(String)symptome.getSelectedItem(),"","En attente",qui.getSelectedIndex() == 0 ? ageP :Integer.parseInt(age.getText()),qui.getSelectedIndex() == 0 ? sexeP : M.isSelected()?"Masculin":"Feminin",details.getText()};
              def.addRow(item);
           conn.close();
        }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Erreur d'ajout ");
      }
   
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try{
          Connection con = connection();
           pst = conn.prepareStatement("UPDATE public.patient\n" +
"	SET nom=?, prenom=?, sexe=?, adresse=?, syntome=?, age=?, detaille=?\n" +
"	WHERE   num_id = ? ;");
      
       }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null,"Erreur de Modification");
      }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   
     details.setText("");
     symptome.getSelectedItem();
     
    }//GEN-LAST:event_jButton5ActionPerformed

    @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace"})
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel def = (DefaultTableModel) table.getModel();
      try{
          Connection conn = connection();
           pst = conn.prepareStatement("delete from symptomes where id_patient = ? and nom = ? and symptomes = ? and age =? and sexe = ? and details = ? ");
           int  ligne = table.getSelectedRow();
           pst.setInt(1,id);
           pst.setString(2, (String)table.getValueAt(ligne, 0));
           pst.setString(3, (String)table.getValueAt(ligne, 1));
           pst.setInt(4, (Integer)table.getValueAt(ligne, 4));
           pst.setString(5, (String)table.getValueAt(ligne, 5));
           pst.setString(6, (String)table.getValueAt(ligne, 6));
           pst.executeUpdate();
           
           def.removeRow(ligne);
           
           conn.close();
           JOptionPane.showMessageDialog(null,"Supprimer avec Succes"); 
           table();
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Erreur de Suppression ");
      }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
        if(M.isSelected()) F.setSelected(false);
        else F.setSelected(true);
    }//GEN-LAST:event_MActionPerformed

    private void quiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiActionPerformed
        // TODO add your handling code here:
        if(qui.getSelectedIndex() == 0){
        age.setVisible(false);
        M.setVisible(false);
        F.setVisible(false);
        ageL.setVisible(false);
        sexeL.setVisible(false);
        nom.setVisible(false);
        nomL.setVisible(false);
        }
        else{
            nom.setVisible(true);
        nomL.setVisible(true);
            age.setVisible(true);
        M.setVisible(true);
        F.setVisible(true);
        ageL.setVisible(true);
        sexeL.setVisible(true);
        }
    }//GEN-LAST:event_quiActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        
    }//GEN-LAST:event_tableMouseReleased

    private void tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseEntered

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
        if(F.isSelected()) M.setSelected(false);
        else M.setSelected(true);
    }//GEN-LAST:event_FActionPerformed

    private void symptomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptomeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed
    
    /**
     *
     */
    public void table(){
            String []patient={"ID","Nom","Prenom","Sexe","Adresse","Syntome","Age","detail"};
            String []  afficher = new String [8];
            
            DefaultTableModel model = new DefaultTableModel(null,patient);
            String pp = "select * from patient";
        try{
          Connection conn = connection();
          Statement st;
          st = conn.createStatement();
          rs = st.executeQuery(pp);
          
            while(rs.next()){
           afficher[0] = rs.getString("num_id");
           afficher[1] = rs.getString("nom"); 
           afficher[2] = rs.getString("prenom");
           afficher[3] = rs.getString("sexe");
           afficher[4] = rs.getString("adresse");
           afficher[5] = rs.getString("Syntome");
           afficher[6] = rs.getString("age");
           afficher[7] = rs.getString("detaille");
           model.addRow(afficher);
           
        }
          table.setModel(model);
          conn.close();
        }catch(SQLException e){
        }
    }

    /**
     *
     * @param args
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton M;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageL;
    private javax.swing.JTextArea details;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nomL;
    private javax.swing.JComboBox<String> qui;
    private javax.swing.JLabel sexeL;
    private javax.swing.JComboBox<String> symptome;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}

