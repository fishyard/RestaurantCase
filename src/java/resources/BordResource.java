package resources;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Bord;
import services.BordService;

@Path("/bord")
public class BordResource {
    //private static String melding = "start";
    //private static String gjester = "1";
    
    BordService bordService = new BordService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Bord> getTekst(){
        return bordService.getAlleBord();
    }
    
    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGjester(){
        return gjester;
    }*/
    
    /*@POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void addMelding(String nyMelding){
        melding = nyMelding;
    }*/
}