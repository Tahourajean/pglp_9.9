/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;

class Cercle extends Forme{
    int rayon;
    Cercle(Coordonnee c, int r,String nom){
        super(c,nom);
        rayon = r;
    }

    @Override
    double afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
 }