/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacos2;
import java.sql.Timestamp;

/**
 *
 * @author hammadin
 */
public class Vehicule {
 
    private int id;
    private String provenance ;
    private Timestamp dateEntree;

    Vehicule(){
        
    }
    
    public Vehicule(int identifiant, String prov, Timestamp dateE){
        this.id= identifiant;
        this.provenance = prov;
        this.dateEntree = dateE;
    }
    public int getId() {
        return id;
    }
    public void setId( int id ) {
        this.id = id;
    }

    public void setProvenance( String prov ) {
        this.provenance = prov;
    }
    public String getNom() {
        return this.provenance;
    }

    public Timestamp getDateEntree() {
        return dateEntree;
    }
    public void setDateEntree( Timestamp dateEnt ) {
        this.dateEntree = dateEnt;
    }

}
