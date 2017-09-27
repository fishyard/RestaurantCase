/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

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
        gjester.put(1L, new Gjest(1, "testforrett1", "testhovedrett1", ""));
        gjester.put(2L, new Gjest(1, "", "hamburgermedbacon", ""));
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
    
    public Gjest settInnGjest(Gjest gjest){
        gjest.setId(gjester.size() + 1);
        gjester.put(gjest.getId(), gjest);
        return gjest;
    }
    
    public Gjest oppdaterGjest(Gjest gjest){
        if(gjest.getId() <= 0){
            return null;
        }
        gjester.put((long)gjest.getId(), gjest);
        return gjest;
    }
}
