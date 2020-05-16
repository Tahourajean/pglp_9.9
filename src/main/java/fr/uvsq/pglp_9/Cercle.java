/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;

public class Cercle extends Forme {

    int rayon;

    Cercle(Coordonnee c, int r, String nom) {
        super(c, nom);
        rayon = r;
    }

    @Override
    public void afficher() {
        System.out.println("Cercle(centre=(" + super.getCentre().getX()
                + "," + super.getCentre().getY() + ")" + ",rayon=" + getRayon() + ")");

    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

}
