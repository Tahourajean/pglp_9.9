/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;
abstract class Forme{
    protected Coordonnee centre;
    String nom;
    Forme(Coordonnee c,String nom){
       this.centre=c;this.nom=nom;
       
    }
     void deplaceDe( Coordonnee centre, int x,int y){ 
      centre.setX(x);
      centre.setY(y);
    }
    
    abstract double afficher();
    //abstract double deplacer();
 } 
 