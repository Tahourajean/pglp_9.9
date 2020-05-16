/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUser;

import fr.uvsq.commandes.Commande;
import fr.uvsq.commandes.Commande_Carree;
import fr.uvsq.commandes.Commande_Cercle;
import fr.uvsq.commandes.Commande_Rectangle;
import fr.uvsq.commandes.Commande_Triangle;
import  fr.uvsq.pglp_9.Forme;

/**
 *
 * @author USER
 */
public class DrawingTUI {
    //méthode permettannt d'analyser la saisie de l'utilisateur et de lui renvoyer la commande correspondant à sa saisie.
    public Commande nextCommand(String saisiUser)
    {
        if(saisiUser.indexOf("carre")!=-1) {
            Commande_Carree commande_Carree=new Commande_Carree();
            return commande_Carree;
        }
        else if(saisiUser.indexOf("cercle")!=-1){
            Commande_Cercle commande_Cercle=new Commande_Cercle();
            return commande_Cercle;
        }
        else if(saisiUser.indexOf("rectangle")!=-1)
        {
            Commande_Rectangle commande_Rectangle=new Commande_Rectangle();
            return commande_Rectangle;
        }
        else
        {
            Commande_Triangle commande_Triangle=new Commande_Triangle();
            return commande_Triangle;
        }
      
}
    //methode permettant d'afficher un dessin passer en paramètre
    public void afficherDessin(Forme forme)
    {
        forme.afficher();
    }
}