package services;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Bord;
import org.glassfish.jersey.process.internal.RequestScoped;
import resources.BordService;

@Path("/bord")
//@RequestScoped
public class BordResource {
    //private static String melding = "start";
    //private static String gjester = "1";
    
    BordService bordService = new BordService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bord> getTekst(){
        return bordService.getAlleBord();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Bord test(@PathParam("id") long id){
        return bordService.getBord(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Bord addBord(Bord bord){
        return bordService.settInnBord(bord);
    }
    
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Bord oppdaterBord(@PathParam("id") long id, Bord bord){
        bord.setId(id);
        return bordService.oppdaterBord(bord);
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteBord(@PathParam("id") long id){
        bordService.fjernBord(id);
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