/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;

 public class Rectangle extends Carre{
    int longueur;
    Rectangle(Coordonnee c,int largeur, int longueur,String nom){
       super(c,largeur,nom);
       this.longueur =  longueur;
    }
    /*
       cette fonction permet d'afficher un rectangle
    */
    
    public void afficher(Rectangle R)
    {
        System.out.println("Rectangle(centre("+R.getCentre().getX()
        +","+R.getCentre().getY()+")"+",Longueur="+R.getLongueur()+",Largeur="+R.getCote()+")");
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

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