/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bord {
    private int plasser;
    private long id;
    //private static int idPointer = 0;
    public Kunde kunde;
    public Bord(){
        //idPointer++;
    }
    
    public Bord(long id, int plasser){
        this.plasser = plasser;
        this.id = id;
        kunde = null;
        //idPointer++;
    }
    
    public void setKunde(Kunde nyKunde){
        kunde = nyKunde;
    }
    
    public void fjernKunde(){
        kunde = null;
    }
    
    public boolean ledig(){
        return kunde == null;
    }
    
    public long getId(){
        return id;
    }
    
    public void setId(long nyId){
        id = nyId;
    }
    
    public int getPlasser(){
        return plasser;
    }
    
    public void setPlasser(int nyPlasser){
        plasser = nyPlasser;
    }
}
