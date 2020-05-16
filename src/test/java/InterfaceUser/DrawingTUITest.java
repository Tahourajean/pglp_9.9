/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUser;

import fr.uvsq.commandes.Commande;
import fr.uvsq.pglp_9.Forme;
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
public class DrawingTUITest {
    
    public DrawingTUITest() {
    }
    

    /**
     * Test of nextCommand method, of class DrawingTUI.
     */
    @Test
    public void testNextCommand() {
        System.out.println("nextCommand");
        String saisiUser = "";
        DrawingTUI instance = new DrawingTUI();
        Commande expResult = null;
        Commande result = instance.nextCommand(saisiUser);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of afficherDessin method, of class DrawingTUI.
     */
    @Test
    public void testAfficherDessin() {
        System.out.println("afficherDessin");
        Forme forme = null;
        DrawingTUI instance = new DrawingTUI();
        instance.afficherDessin(forme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
