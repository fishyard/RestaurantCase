/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Gjest {
    private long id;
    //private static int idPointer = 0;
    private String forrett;
    private String hovedrett;
    private String dessert;
    
    public Gjest(){
        //idPointer++;
    }
    
    public Gjest(long id, String forrett, String hovedrett, String dessert){
        this.forrett = forrett;
        this.hovedrett = hovedrett;
        this.dessert = dessert;
        this.id = id;
        //idPointer++;
    }
    
    public String getForrett(){
        return forrett;
    }
    
    public void setForrett(String nyForrett){
        forrett = nyForrett;
    }
    
    public String getHovedrett(){
        return hovedrett;
    }
    
    public void setHovedrett(String nyHovedrett){
        hovedrett = nyHovedrett;
    }
    
    public String getDessert(){
        return dessert;
    }
    
    public void setDessert(String nyDessert){
        dessert = nyDessert;
    }
    
    public long getId(){
        return id;
    }
    
    public void setId(long nyId){
        id = nyId;
    }
}
