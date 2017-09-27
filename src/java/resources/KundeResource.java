package resources;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Kunde;
import services.KundeService;


@Path("/kunde")
public class KundeResource {
    //private static String melding = "start";
    //private static String gjester = "1";
    
    KundeService kundeService = new KundeService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Kunde> getTekst(){
        return kundeService.getAlleKunder();
    }
    
    @GET
    @Path("/{kundeId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test(@PathParam("kundeId")String kundeId){
        //kundeService.getKunde(kundeId);
        return "Path param " + kundeId;
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