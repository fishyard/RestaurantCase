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
import models.Gjest;

/**
 *
 * @author Balder
 */
public class GjestService {
    private Map<Long, Gjest> gjester = DataBase.getGjester();
    
    public GjestService(){
        gjester.put(1L, new Gjest("testforrett1", "testhovedrett1", ""));
        gjester.put(2L, new Gjest("", "hamburgermedbacon", ""));
    }
    
    public List<Gjest> getAlleGjester(){
        /*Bord b1 = new Bord(4);
        Bord b2 = new Bord(6);
        List<Bord> liste = new ArrayList<>();
        liste.add(b1);
        liste.add(b2);*/
        return new ArrayList<Gjest>(gjester.values());
    }
    
    public Gjest getGjest(long id){
        return gjester.get(id);
    }
    
    public void settInnBord(Gjest gjest){
        gjest.setId(gjest.getId() + 1);
        gjester.put((long)gjest.getId(), gjest);
    }
    
    public void oppdaterBord(Gjest gjest){
        gjester.put((long)gjest.getId(), gjest);
    }
}
