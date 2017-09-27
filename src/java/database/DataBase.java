/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.HashMap;
import java.util.Map;
import models.Bord;
import models.Gjest;
import models.Kunde;

/**
 *
 * @author Balder
 */
public class DataBase {
    private static Map<Long, Gjest> gjester = new HashMap<>();
    private static Map<Long, Kunde> kunder = new HashMap<>();
    private static Map<Long, Bord> bord = new HashMap<>();
    
    public static Map<Long, Gjest> getGjester(){
        return gjester;
    }
    
    public static Map<Long, Kunde> getKunder(){
        return kunder;
    }
    
    public static Map<Long, Bord> getBord(){
        return bord;
    }
}
