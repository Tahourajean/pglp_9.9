/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import fr.uvsq.pglp_9.Rectangle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class RectangleDAOTest {
    
    public RectangleDAOTest() {
    }
    
   
    /**
     * Test of create method, of class RectangleDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Rectangle obj = null;
        RectangleDAO instance = new RectangleDAO();
        Rectangle expResult = null;
        Rectangle result = instance.create(obj);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of delete method, of class RectangleDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Rectangle obj = null;
        RectangleDAO instance = new RectangleDAO();
        Rectangle expResult = null;
        Rectangle result = instance.delete(obj);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of update method, of class RectangleDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Rectangle obj = null;
        RectangleDAO instance = new RectangleDAO();
        Rectangle expResult = null;
        Rectangle result = instance.update(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of find method, of class RectangleDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String obj = "";
        RectangleDAO instance = new RectangleDAO();
        Rectangle expResult = null;
        Rectangle result = instance.find(obj);
        assertEquals(expResult, result);
        
    }
    
}
