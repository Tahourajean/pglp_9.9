/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;

 class Carre extends Forme{
    int cote;
    Carre(Coordonnee c, int cote,String nom){
       super(c,nom);
       this.cote = cote; 
    }

    @Override
    double afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
 }