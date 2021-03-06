/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import fr.uvsq.pglp_9.Cercle;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class CercleDAO extends DAO<Cercle>{

    public CercleDAO() {
    }

    @Override
    public Cercle create(Cercle obj) {
         try {
            PreparedStatement prepare=connect.
            prepareStatement("INSERT INTO Cercle(x,y,rayon,nom) values(?,? ,?,?)");
            prepare.setInt(1, obj.getCentre().getX());
            prepare.setInt(2, obj.getCentre().getY());
            prepare.setInt(3, obj.getRayon());
            prepare.setString(4, obj.getNom());
            int result=prepare.executeUpdate();
            assert result==1;
        } catch (Exception e) {
        }
         return obj;
    }

    @Override
    public Cercle update(Cercle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cercle delete(Cercle obj) {
        int res=0;
        try {
            PreparedStatement prepare=connect.
            prepareStatement("DELETE FROM Cercle where nom=?");
            prepare.setString(1, obj.getNom());
            res=prepare.executeUpdate();
            
        } catch (Exception e) {
        }
        return obj;
    }

    @Override
    public Cercle find(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    