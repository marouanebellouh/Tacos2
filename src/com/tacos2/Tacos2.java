/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacos2;
import com.tacos.dao.*;
import static java.lang.Thread.sleep;

/**
 *
 * @author hammadin
 */
public class Tacos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
       Vehicule v = new Vehicule();
       DAOFactory DAOf = DAOFactory.getInstance();
       VehiculeDAOImpl vDAO = new VehiculeDAOImpl(DAOf);
       vDAO.delete(1);
       vDAO.delete(2);
       vDAO.delete(3);
       System.out.println("Insertion d'un véhicule : ");
       vDAO.insert(1);
       sleep(2000);
       vDAO.find(1);
       System.out.println("Mise à jour : provenance(Lyon)");
       vDAO.update(1);
       sleep(2000);
       vDAO.find(1);
       System.out.println("Suppression du tuple...");
       vDAO.delete(1);
       sleep(3000);
       vDAO.find(1);
       System.out.println("Insertion de 3 tuples : ");
       vDAO.insert(1);
       vDAO.insert(2);
       vDAO.insert(3);
       vDAO.find(1);
       vDAO.find(2);
       vDAO.find(3);
    
    }
    
}
