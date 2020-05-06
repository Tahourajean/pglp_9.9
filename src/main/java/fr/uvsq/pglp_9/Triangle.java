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
    void afficher() {
        System.out.println("Triangle(cote1="+getCentre().getX()+",cote2="+
                getCentre().getY()+",cote3="+getM_l3()+")");
    }

    public double getM_l3() {
        return m_l3;
    }

    public void setM_l3(double m_l3) {
        this.m_l3 = m_l3;
    }

    
}