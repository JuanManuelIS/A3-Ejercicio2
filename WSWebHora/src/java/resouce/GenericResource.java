/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resouce;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

//test
import java.util.Date;


/**
 * REST Web Service
 *
 * @author entrar
 */
@Path("horaServidor")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of resouce.GenericResource
     * @return an instance of java.lang.String
     */
    
    private static String horaImpuesta = "";
    @GET
    @Produces("application/json")
    public String getJson() {     
    
        if(horaImpuesta.equals("")){
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
        
            return "{\"Hora\" : \"" + dateFormat.format(date) + "\"}";
        }
        return horaImpuesta;
        
    
    
    } 

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
        horaImpuesta = content;
    }
}
