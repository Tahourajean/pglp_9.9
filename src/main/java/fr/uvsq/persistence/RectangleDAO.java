/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;

import fr.uvsq.pglp_9.Rectangle;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class RectangleDAO extends DAO<Rectangle> {

    @Override
    public Rectangle create(Rectangle obj) {
        try {
            PreparedStatement prepare = connect.
                    prepareStatement("INSERT INTO Rectangle(nom,centre_x,centre_y,longueur,largeur) values(?,? ,?,?,?)");
            prepare.setString(1, obj.getNom());
            prepare.setInt(2, obj.getCentre().getX());
            prepare.setInt(3, obj.getCentre().getY());
            prepare.setInt(4, obj.getLongueur());
            prepare.setInt(4, obj.getCote());
            int result = prepare.executeUpdate();
            assert result == 1;
        } catch (Exception e) {
        }
        return obj;
    }

    @Override
    public Rectangle delete(Rectangle obj) {
        int res = 0;
        try {
            PreparedStatement prepare = connect.
                    prepareStatement("DELETE FROM Rectangle where nom=?");
            prepare.setString(1, obj.getNom());
            res = prepare.executeUpdate();

        } catch (Exception e) {
        }
        return obj;
    }

    @Override
    public Rectangle update(Rectangle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rectangle find(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
