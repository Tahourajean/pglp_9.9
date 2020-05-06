/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import java.sql.Connection;



/**
 *
 * @author USER
 * @param <T>
 */
public abstract class DAO<T> 
{
     ConnBD conndb=new ConnBD();
     protected Connection connect=conndb.connect();
     public abstract T create(T obj);
     public abstract T update(T obj);
     public abstract T  delete(T obj);
     public abstract T find(String obj);
    
}
