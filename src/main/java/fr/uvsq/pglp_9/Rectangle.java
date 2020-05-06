/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;

 class Rectangle extends Carre{
    int longueur;
    Rectangle(Coordonnee c,int largeur, int lo,String nom){
       super(c,largeur,nom);
       this.longueur =  lo;
    }
    public void afficher()
    {
        System.out.println("Rectangle(centre("+getCentre().getX()
        +","+getCentre().getY()+")"+",Longueur="+getLongueur()+",Largeur="+getCote()+")");
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