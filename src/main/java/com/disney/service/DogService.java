package com.disney.service;

import com.disney.database.DataLoader;
import com.disney.database.DatabaseClass;
import com.disney.model.Breed;
import com.disney.model.Dog;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by slowell on 2/19/17.
 */
@Service
public class DogService implements IDogService{
    private Map<String, Dog> dogsMap = DatabaseClass.getDogMap();

    public DogService() {
        DataLoader.getInstance();
    }

    /**
     * Find a Dog info by given dogPic name such as "oSieVUO.png"
     * The dogPic is the name after .com/ from url
     *
     * @param dogPicUrl the name after .com/ from url
     * @return
     */
    @Override
    public Dog findDogByPic(String dogPicUrl) {
        if(dogsMap != null && dogsMap.containsKey(dogPicUrl)){
            return  dogsMap.get(dogPicUrl);
        }
        return null;
    }

    /**
     * Increase up vote for the dog pic name
     *
     * @param dogPicUrl the name after .com/ from url
     * @return
     */
    @Override
    public Dog updateUpVoteDog(String dogPicUrl){
        Dog dog;
        if(dogsMap != null && dogsMap.containsKey(dogPicUrl)){
            dog = dogsMap.get(dogPicUrl);
            dog.setUpVotes(dog.getUpVotes() + 1);
            dogsMap.put(dogPicUrl, dog);
            return dog;
        }
        return null;
    }

    /**
     * Increase down vote for the dog pic name
     *
     * @param dogPicUrl the name after .com/ from url
     * @return
     */
    @Override
    public Dog updateDownVoteDog(String dogPicUrl){
        Dog dog;
        if(dogsMap != null && dogsMap.containsKey(dogPicUrl)){
            dog = dogsMap.get(dogPicUrl);
            dog.setDownVotes(dog.getDownVotes() + 1);
            dogsMap.put(dogPicUrl, dog);
            return dog;
        }
        return null;
    }
}
