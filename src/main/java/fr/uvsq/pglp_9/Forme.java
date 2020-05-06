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
    
    abstract void afficher();

    public Coordonnee getCentre() {
        return centre;
    }

    public void setCentre(Coordonnee centre) {
        this.centre = centre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
 } 
 