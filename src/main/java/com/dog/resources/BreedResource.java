package com.dog.resources;

import com.dog.model.Dog;
import com.dog.model.Breed;
import com.dog.service.IBreedService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

/**
 * Created by slowell on 2/19/17.
 */
@Path("breed")
public class BreedResource {
    @Autowired IBreedService breedService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listDogs/breedName/{breedName}")
    public List<Dog> listDogsForBreed(@PathParam("breedName") String breedName){
        return breedService.listDogsForBreed(breedName.toLowerCase());
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("listDogs")
    public List<Breed> listDogsForBreed(){
        return breedService.listAllDogsByAllBreeds();
    }
}
