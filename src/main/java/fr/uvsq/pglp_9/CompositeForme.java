/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_9;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class CompositeForme extends Forme  {
    private List<Forme> groupeForme =new ArrayList<>();
    public void add(Forme forme)
    {
        groupeForme.add(forme);
    }
    public void remove(Forme forme)
    {
        groupeForme.remove(forme);
    }

    public CompositeForme(Coordonnee c, String nom) {
        super(c, nom);
    }

    @Override
    public void afficher() {
        for (Forme forme : groupeForme) {
            forme.afficher();
        }
    }

    public List<Forme> getGroupeForme() {
        return groupeForme;
    }

    public void setGroupeForme(List<Forme> groupeForme) {
        this.groupeForme = groupeForme;
    }
    
    
}
