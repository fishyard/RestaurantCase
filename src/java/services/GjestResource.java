package services;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Gjest;
import resources.GjestService;


@Path("/gjest")
public class GjestResource {
    //private static String melding = "start";
    //private static String gjester = "1";
    
    GjestService gjestService = new GjestService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Gjest> getTekst(){
        return gjestService.getAlleGjester();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Gjest addBord(Gjest gjest){
        return gjestService.settInnGjest(gjest);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Gjest test(@PathParam("id") long id){
        return gjestService.getGjest(id);
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