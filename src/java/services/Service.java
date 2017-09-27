package services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;

/**
 *
 * @author Administrator
 */
@Path("/services")
public class Service {
    private static String melding = "start";
    private static String gjester = "1";
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTekst(){
        return "Melding: " + melding + " Gjester: " + gjester;
    }
    
    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGjester(){
        return gjester;
    }*/
    
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void addMelding(String nyMelding){
        melding = nyMelding;
    }
}
