/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;
import fr.uvsq.pglp_9.Triangle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class TriangleDAOTest {
    
    public TriangleDAOTest() {
    }
     
    /**
     * Test of create method, of class TriangleDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Triangle obj = null;
        TriangleDAO instance = new TriangleDAO();
        Triangle expResult = null;
        Triangle result = instance.create(obj);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of update method, of class TriangleDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Triangle obj = null;
        TriangleDAO instance = new TriangleDAO();
        Triangle expResult = null;
        Triangle result = instance.update(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class TriangleDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Triangle obj = null;
        TriangleDAO instance = new TriangleDAO();
        Triangle expResult = null;
        Triangle result = instance.delete(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of find method, of class TriangleDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String obj = "";
        TriangleDAO instance = new TriangleDAO();
        Triangle expResult = null;
        Triangle result = instance.find(obj);
        assertEquals(expResult, result);
        
        
    }
    
}
