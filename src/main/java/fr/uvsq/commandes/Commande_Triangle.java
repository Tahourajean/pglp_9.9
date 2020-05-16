/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.commandes;

import fr.uvsq.persistence.RectangleDAO;
import fr.uvsq.persistence.TriangleDAO;
import fr.uvsq.pglp_9.Forme;
import fr.uvsq.pglp_9.Rectangle;
import fr.uvsq.pglp_9.Triangle;

/**
 *
 * @author USER
 */
public class Commande_Triangle implements Commande{
private TriangleDAO triangleDAO;
private Triangle triangle;
    @Override
    public Forme execute() {
        this.triangleDAO.create(triangle);
       return triangle;
    }
    
}
