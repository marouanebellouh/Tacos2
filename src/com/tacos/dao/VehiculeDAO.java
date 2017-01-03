/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacos.dao;
import com.tacos2.*;
/**
 *
 * @author hammadin
 */
public interface VehiculeDAO {
    void insert( int id ) throws DAOException;
    
    void find( int id ) throws DAOException;
    
    void update ( int id ) throws DAOException;
    
    void delete ( int id ) throws DAOException;
}
