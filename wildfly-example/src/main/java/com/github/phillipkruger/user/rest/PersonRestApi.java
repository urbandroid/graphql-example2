package com.github.phillipkruger.user.rest;

import com.github.phillipkruger.user.service.PersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/person")
@Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
@Tag(name = "Person service",description = "Person Services")
public class PersonRestApi {
    
    @Inject
    private PersonService personService;
    
    @GET 
    @Path("/{id}")
    @Operation(description = "Get a person using the person's Id")
    public Response getPerson(@PathParam("id") int id){
        return Response.ok(personService.getPerson(id)).build();
    }
    
    @GET
    @Operation(description = "Get all people")
    public Response getPeople(){
        return Response.ok(personService.getPeople()).build();
    }
}