package com.gestion.service.api.api;


import com.gestion.service.api.to.AdherentTo;
import com.gestion.service.api.to.MessageTo;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/adherent")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ApiAdherentService {

    @GET
    @Path("/{id}")
    AdherentTo getAdherent(@PathParam("id") Integer id);

    @POST
    @Path("")
    void saveAdherent(@RequestParam AdherentTo adherentTo);

    @PUT
    @Path("/{id}")
    void updateAdherent(@PathParam("id") Integer id,@RequestParam AdherentTo adherentTo);

    @DELETE
    @Path("/{id}")
    void deleteAdherent(@PathParam("id") Integer id);


}
