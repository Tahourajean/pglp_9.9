/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUser;

import fr.uvsq.commandes.Commande;
import fr.uvsq.pglp_9.Forme;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DrawingApp {
    private final DrawingTUI drawingTUI=new DrawingTUI();
    private  Commande commande;
    private Forme forme ;
    public void run()
    {
        System.out.println("Bienvenu dans notre application de dessin\n");
        //on recupère la saisie de l'utilisateur
        System.out.println("Veuillez entrer une commande:");
        Scanner sc = new Scanner(System.in);
        String saisitUser=sc.nextLine();
        //on fait appel à la méthode nextCommand de la classe DrawingTUI pour analyser cette saisie
        commande =drawingTUI.nextCommand(saisitUser);
        //on éxecute la commande 
        forme=commande.execute();
        //on affiche le resultat
        drawingTUI.afficherDessin(forme);
    }
    
}
