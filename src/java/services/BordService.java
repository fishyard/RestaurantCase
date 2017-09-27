/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import database.DataBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import models.Bord;

/**
 *
 * @author Balder
 */
public class BordService {
    private Map<Long, Bord> bord = DataBase.getBord();
    
    public BordService(){
        bord.put(1L, new Bord(4));
        bord.put(2L, new Bord(6));
    }
    
    public List<Bord> getAlleBord(){
        /*Bord b1 = new Bord(4);
        Bord b2 = new Bord(6);
        List<Bord> liste = new ArrayList<>();
        liste.add(b1);
        liste.add(b2);*/
        return new ArrayList<Bord>(bord.values());
    }
    
    public Bord getBord(long id){
        return bord.get(id);
    }
    
    public void settInnBord(Bord etBord){
        etBord.setId(etBord.getId() + 1);
        bord.put((long)etBord.getId(), etBord);
    }
    
    public void oppdaterBord(Bord etBord){
        bord.put((long)etBord.getId(), etBord);
    }
}
