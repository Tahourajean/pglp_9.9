/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.commandes;

import fr.uvsq.persistence.CarreDAO;
import fr.uvsq.pglp_9.Carre;
import fr.uvsq.pglp_9.Forme;

/**
 *
 * @author USER
 */
public class Commande_Carree implements Commande{
    private Carre carre;
    private CarreDAO carreDAO;

    @Override
    public Forme execute() {
        carreDAO.create(carre);
        return carre;
    }
    
}
