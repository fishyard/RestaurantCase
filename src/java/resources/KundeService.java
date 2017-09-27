/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import database.DataBase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import models.Gjest;
import models.Kunde;

/**
 *
 * @author Balder
 */
public class KundeService {
    private Map<Long, Kunde> kunder = DataBase.getKunder();
    
    public KundeService(){
        /*Gjest[] gjester1 = new Gjest[2];
        gjester1[0] = new Gjest("brød", "spaghetti", "brownie");
        gjester1[1] = new Gjest("bønner", "hamburger", "sjokoladekake");
        Gjest[] gjester2 = new Gjest[3];
        gjester2[0] = new Gjest("omelett", "biff", "");
        gjester2[1] = new Gjest("", "testmiddag", "");
        gjester2[2] = new Gjest("testforrett", "testmiddag2", "testdessert");
        Date dato1 = new Date();
        Date dato2 = new Date();
        kunder.put(1L, new Kunde(gjester1, dato1));
        kunder.put(2L, new Kunde(gjester2, dato2));*/
    }
    
    public List<Kunde> getAlleKunder(){
        /*Bord b1 = new Bord(4);
        Bord b2 = new Bord(6);
        List<Bord> liste = new ArrayList<>();
        liste.add(b1);
        liste.add(b2);*/
        return new ArrayList<Kunde>(kunder.values());
    }
    
    public Kunde getKunde(long id){
        return kunder.get(id);
    }
    
    public Kunde settInnKunde(Kunde kunde){
        kunde.setId(kunder.size() + 1);
        kunder.put(kunde.getId(), kunde);
        return kunde;
    }
    
    public Kunde oppdaterKunde(Kunde kunde){
        if(kunde.getId() <= 0){
            return null;
        }
        kunder.put((long)kunde.getId(), kunde);
        return kunde;
    }
}
