/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;

public class Triangle extends Forme{
private double  m_l3;
public Triangle(Coordonnee centre, int c,String nom){
    super(centre,nom);
    m_l3=c;

}

    @Override
    double afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}