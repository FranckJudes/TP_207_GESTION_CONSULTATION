/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.consultation;

import java.sql.SQLException;

/**
 *
 * @author Judes Franck
 */
public class GestionDeConsultation {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
//        Programm connection = new Programm();
//        connection.Connect();
        
        GestionPatient patientA = new GestionPatient(1);
        patientA.setLocationRelativeTo(null);
        patientA.show();
        //patientA.table();
    }
    
}
