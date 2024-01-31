package com.github.phillipkruger.user.rest;

import com.github.phillipkruger.user.model.Score;
import com.github.phillipkruger.user.service.ScoreService;
import java.util.List;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/score")
@Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
@Tag(name = "Score service",description = "Score Services")
public class ScoreRestApi {
    
    @Inject 
    private ScoreService scoreService;
    
    @GET 
    @Path("/{idNumber}")
    @Operation(description = "Get a person's scores using the person's Id Number")
    public List<Score> getScores(@PathParam("idNumber") String idNumber){
        return scoreService.getScores(idNumber);
    } 
}