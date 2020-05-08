/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import fr.uvsq.pglp_9.Carre;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class CarreDAO extends DAO <Carre> {

    @Override
    public Carre create(Carre obj) {
        try {
            PreparedStatement prepare=connect.
            prepareStatement("INSERT INTO Carre(nom,absisse,ordonne,cote) values(?,? ,?,?)");
            prepare.setString(1, obj.getNom());
            prepare.setInt(2, obj.getCentre().getX());
            prepare.setInt(3, obj.getCentre().getY());
            prepare.setInt(4, obj.getCote());
            int result=prepare.executeUpdate();
            assert result==1;
        } catch (Exception e) {
        }
         return obj;
    }

    @Override
    public Carre update(Carre obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carre delete(Carre obj) {
         int res=0;
        try {
            PreparedStatement prepare=connect.
            prepareStatement("DELETE FROM Carre where nom=?");
            prepare.setString(1, obj.getNom());
            res=prepare.executeUpdate();
            
        } catch (Exception e) {
        }
        return obj;
    }

    @Override
    public Carre find(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
