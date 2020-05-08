/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import fr.uvsq.pglp_9.Triangle;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class TriangleDAO extends DAO<Triangle>{

    @Override
    public Triangle create(Triangle obj) {
      try {
            PreparedStatement prepare = connect.
                    prepareStatement("INSERT INTO Triangle(nom,centre_x,centre_y,somet1_x,somet1_y"
                            + ",somet2_x,somet2_y,somet3_x,somet3_y) values(?,? ,?,?,?,?,?,?,?)");
            prepare.setString(1, obj.getNom());
            prepare.setInt(2, obj.getCentre().getX());
            prepare.setInt(3, obj.getCentre().getY());
            prepare.setInt(4, obj.getSomet_1().getX());
            prepare.setInt(5, obj.getSomet_1().getY());
            prepare.setInt(6, obj.getSomet_2().getX());
            prepare.setInt(7, obj.getSomet_2().getY());
            prepare.setInt(8, obj.getSomet_3().getX());
            prepare.setInt(9, obj.getSomet_3().getY());
            int result = prepare.executeUpdate();
            assert result == 1;
        } catch (Exception e) {
        }
        return obj;
    }

    @Override
    public Triangle update(Triangle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Triangle delete(Triangle obj) {
        int res=0;
        try {
            PreparedStatement prepare = connect.
                    prepareStatement("DELETE FROM Triangle where nom=?");
            prepare.setString(1, obj.getNom());
            res = prepare.executeUpdate();

        } catch (Exception e) {
        }
        return obj;
    }

    @Override
    public Triangle find(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
