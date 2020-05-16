/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.commandes;

import fr.uvsq.persistence.RectangleDAO;
import fr.uvsq.pglp_9.Rectangle;

/**
 *
 * @author USER
 */
public class Commande_Rectangle implements Commande{
    private RectangleDAO recangleDAO;
    private Rectangle rectangle;

    @Override
    public void execute() {
        this.recangleDAO.create(rectangle);
    }
    
}
