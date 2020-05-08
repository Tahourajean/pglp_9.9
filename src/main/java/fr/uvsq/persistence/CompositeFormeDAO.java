/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.persistence;


import fr.uvsq.pglp_9.CompositeForme;
import fr.uvsq.pglp_9.Cercle;
import fr.uvsq.pglp_9.Carre;
import fr.uvsq.pglp_9.Rectangle;
/**
 *
 * @author USER
 */
public class CompositeFormeDAO extends DAO<CompositeForme>{
CercleDAO cercloeDAO=new CercleDAO();
CarreDAO carreDAO=new CarreDAO();
RectangleDAO rectangleDAO=new RectangleDAO();
/* 
    cette fonction parcourt une liste d'une composite et teste à chaque fois la valeur couante du parcours
    en fonction du l'instance de la classe concernée , on qppelle la méthode create de cette classe pour créer l'objet
    ou pour persister l'objet dans la bas de donnée
*/
    @Override
    public CompositeForme create(CompositeForme obj) {
        for (int i = 0; i < obj.getGroupeForme().size(); i++) {
            if(obj.getGroupeForme().get(i) instanceof Cercle)
            {
                cercloeDAO.create((Cercle) obj.getGroupeForme().get(i));
            }
            else if(obj.getGroupeForme().get(i) instanceof Carre)
            {
                carreDAO.create((Carre) obj.getGroupeForme().get(i));
            }
            else if(obj.getGroupeForme().get(i) instanceof Rectangle)
            {
                rectangleDAO.create((Rectangle) obj.getGroupeForme().get(i));
            }
        }
        return obj;
    }

    @Override
    public CompositeForme update(CompositeForme obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CompositeForme delete(CompositeForme obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CompositeForme find(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
