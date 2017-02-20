package com.disney.service;

import com.disney.database.DatabaseClass;
import com.disney.model.Breed;
import jersey.repackaged.com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by slowell on 2/19/17.
 */
public class BreedServiceTest {
    BreedService breedService;
    Map<String, Breed> breedsMap;

    @org.junit.Before
    public void setUp() throws Exception {
        breedService = new BreedService();
        breedsMap = DatabaseClass.getBreedsMap();

    }

    @org.junit.Test
    public void listAllDogsByAllBreedsSize() throws Exception {
        //There are 4 breeds
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().size(), 4);

    }

    @org.junit.Test
    public void listAllDogsByAllBreedsName() throws Exception {
        List<String> breedName = Lists.newArrayList("labradors", "pug", "retriever", "yorkie");
        //Check If breed names are there
        for (int i = 0; i < 4; i++) {
            Assert.assertTrue(breedName.contains(breedService.listAllDogsByAllBreeds().get(i).getBreedName()));
        }

    }

    @org.junit.Test
    public void listAllDogsSizeByAllBreeds() throws Exception {
        //Check If number of dog url for each breed is correct
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().get(0).getDogs().size(), 39);
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().get(0).getBreedName(), "pug");
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().get(1).getDogs().size(), 33);
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().get(1).getBreedName(), "retriever");
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().get(2).getDogs().size(), 3);
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().get(2).getBreedName(), "yorkie");
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().get(3).getDogs().size(), 15);
        Assert.assertEquals(breedService.listAllDogsByAllBreeds().get(3).getBreedName(), "labradors");

    }

    @org.junit.Test
    public void listDogsUrlSizeForBreed() throws Exception {
        Assert.assertEquals(breedService.listDogsForBreed("pug").size(), 39);
        Assert.assertEquals(breedService.listDogsForBreed("retriever").size(), 33);
        Assert.assertEquals(breedService.listDogsForBreed("yorkie").size(), 3);
        Assert.assertEquals(breedService.listDogsForBreed("labradors").size(), 15);


    }

    @org.junit.Test
    public void listDogsUrlForBreedYorkie() throws Exception {
        for (int i = 0; i < 3; i++) {
            Assert.assertEquals(breedService.listDogsForBreed("yorkie").get(i).getPicUrl(), breedsMap.get("yorkie").getDogs().get(i).getPicUrl());
        }

    }
    @org.junit.Test
    public void listDogsUrlForBreedPug() throws Exception {
        for (int i = 0; i < 39; i++) {
            Assert.assertEquals(breedService.listDogsForBreed("pug").get(i).getPicUrl(), breedsMap.get("pug").getDogs().get(i).getPicUrl());
        }

    }
    @org.junit.Test
    public void listDogsUrlForBreedRetriever() throws Exception {
        for (int i = 0; i < 33; i++) {
            Assert.assertEquals(breedService.listDogsForBreed("retriever").get(i).getPicUrl(), breedsMap.get("retriever").getDogs().get(i).getPicUrl());
        }

    }
    @org.junit.Test
    public void listDogsUrlForBreedLabradors() throws Exception {
        for (int i = 0; i < 15; i++) {
            Assert.assertEquals(breedService.listDogsForBreed("labradors").get(i).getPicUrl(), breedsMap.get("labradors").getDogs().get(i).getPicUrl());
        }

    }

}