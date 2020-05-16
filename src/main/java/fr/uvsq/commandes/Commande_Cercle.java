/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.commandes;

import fr.uvsq.persistence.CercleDAO;
import fr.uvsq.pglp_9.Cercle;

/**
 *
 * @author USER
 */
public class Commande_Cercle implements Commande{
    private CercleDAO cercleDAO;
    private Cercle cercle;

    @Override
    public void execute() {
        cercleDAO.create(cercle);
       
    }
    
}
