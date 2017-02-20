package com.disney.service;

import com.disney.database.DatabaseClass;
import com.disney.model.Dog;
import org.junit.Assert;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by slowell on 2/19/17.
 */
public class DogServiceTest {
    DogService breedService;
    Map<String, Dog> dogsMap;
    @org.junit.Before
    public void setUp() throws Exception {
        breedService = new DogService();
        dogsMap = DatabaseClass.getDogMap();
    }

    @org.junit.Test
    public void findDogByPic() throws Exception {
        Assert.assertEquals(breedService.findDogByPic("oSieVUO.png").getBreedName(), "yorkie");
        Assert.assertEquals(breedService.findDogByPic("oSieVUO.png").getPicUrl(), "http://i.imgur.com/oSieVUO.png");

    }

    @org.junit.Test
    public void updateUpVoteDog() throws Exception {
        Assert.assertEquals(breedService.updateUpVoteDog("oSieVUO.png").getUpVotes(), 1);
        Assert.assertEquals(breedService.updateUpVoteDog("oSieVUO.png").getUpVotes(), 2);


    }

    @org.junit.Test
    public void updateDownVoteDog() throws Exception {
        Assert.assertEquals(breedService.updateDownVoteDog("oSieVUO.png").getDownVotes(), 1);
        Assert.assertEquals(breedService.updateDownVoteDog("oSieVUO.png").getDownVotes(), 2);

    }

}