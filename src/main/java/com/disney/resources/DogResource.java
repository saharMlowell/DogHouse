package com.disney.resources;

import com.disney.model.Dog;
import com.disney.service.IDogService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by slowell on 2/19/17.
 */
@Path("dog")
public class DogResource {
    @Autowired IDogService dogService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findDog/dogPicUrl/{dogPicUrl}")
    public Dog findDogByPic(@PathParam("dogPicUrl") String dogPicUrl){
        return dogService.findDogByPic(dogPicUrl);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("upVote")
    public Dog updateUpVoteDog(@HeaderParam("dogPicUrl") String dogPicUrl){
        return dogService.updateUpVoteDog(dogPicUrl);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("downVote")
    public Dog updateDownVoteDog(@HeaderParam("dogPicUrl") String dogPicUrl){
        return dogService.updateDownVoteDog(dogPicUrl);
    }
}
