/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import fr.uvsq.pglp_9.Cercle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class CercleDAOTest {
    
    public CercleDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class CercleDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Cercle obj = null;
        CercleDAO instance = new CercleDAO();
        Cercle expResult = null;
        Cercle result = instance.create(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CercleDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Cercle obj = null;
        CercleDAO instance = new CercleDAO();
        Cercle expResult = null;
        Cercle result = instance.update(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CercleDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Cercle obj = null;
        CercleDAO instance = new CercleDAO();
        Cercle expResult = null;
        Cercle result = instance.delete(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class CercleDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String obj = "";
        CercleDAO instance = new CercleDAO();
        Cercle expResult = null;
        Cercle result = instance.find(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
