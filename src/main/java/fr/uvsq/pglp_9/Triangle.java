/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;

public class Triangle extends Forme{
//private double  m_l3;
Coordonnee somet_1;
Coordonnee somet_2;
Coordonnee somet_3;
//construire permettant de créer un triangle à partir de trois point donnée par la classe coordonnée
public Triangle(Coordonnee centre, String nom,Coordonnee somet_1,Coordonnee somet_2,Coordonnee somet_3){
  super(centre,nom);
  this.somet_1=somet_1;
  this.somet_2=somet_2;
  this.somet_3=somet_3;

}

   /* @Override
    void afficher(Triangle tr) {
        System.out.println("Triangle(cote1="+tr.getCentre().getX()+",cote2="+
                getCentre().getY()+",cote3="+getM_l3()+")");
    }*/

    public Coordonnee getSomet_1() {
        return somet_1;
    }

    public void setSomet_1(Coordonnee somet_1) {
        this.somet_1 = somet_1;
    }

    public Coordonnee getSomet_2() {
        return somet_2;
    }

    public void setSomet_2(Coordonnee somet_2) {
        this.somet_2 = somet_2;
    }

    public Coordonnee getSomet_3() {
        return somet_3;
    }

    public void setSomet_3(Coordonnee somet_3) {
        this.somet_3 = somet_3;
    }

    @Override
    public void afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}