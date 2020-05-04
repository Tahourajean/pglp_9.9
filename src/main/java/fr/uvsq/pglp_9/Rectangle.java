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
    
 }