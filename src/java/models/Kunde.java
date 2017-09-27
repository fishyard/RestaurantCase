/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Kunde {
    private Gjest[] gjester;
    private Date dato;
    private long id;
    //private static int idPointer = 0;
    
    public Kunde(){
        //idPointer++;
    }
    
    public Kunde(long id, Gjest[] gjester, Date dato){
        this.gjester = gjester;
        this.dato = dato;
        this.id = id;
        //idPointer++;
    }
    
    public int getAntGjester(){
        return gjester.length;
    }
    
    public Gjest[] getGjester(){
        return gjester;
    }
    
    public long getId(){
        return id;
    }
    
    public void setId(long nyId){
        id = nyId;
    }
}
