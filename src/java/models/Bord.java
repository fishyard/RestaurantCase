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
    private int id;
    private int idPointer = 0;
    public Kunde kunde;
    public Bord(){
        idPointer++;
    }
    
    public Bord(int plasser){
        this.plasser = plasser;
        this.id = idPointer;
        kunde = null;
        idPointer++;
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
    
    public int getId(){
        return id;
    }
    
    public void setId(int nyId){
        id = nyId;
    }
    
    public int getPlasser(){
        return plasser;
    }
    
    public void setPlasser(int nyPlasser){
        plasser = nyPlasser;
    }
}
