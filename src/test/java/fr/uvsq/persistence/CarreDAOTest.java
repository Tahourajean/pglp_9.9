/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import fr.uvsq.pglp_9.Carre;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class CarreDAOTest {
    
    public CarreDAOTest() {
    }
    
    @Test
    public void testCreate() {
        System.out.println("create");
        Carre obj = null;
        CarreDAO instance = new CarreDAO();
        Carre expResult = null;
        Carre result = instance.create(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of update method, of class CarreDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Carre obj = null;
        CarreDAO instance = new CarreDAO();
        Carre expResult = null;
        Carre result = instance.update(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class CarreDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Carre obj = null;
        CarreDAO instance = new CarreDAO();
        Carre expResult = null;
        Carre result = instance.delete(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of find method, of class CarreDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String obj = "";
        CarreDAO instance = new CarreDAO();
        Carre expResult = null;
        Carre result = instance.find(obj);
        assertEquals(expResult, result);
        
    }
    
}
