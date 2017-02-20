package com.disney.service;

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

    @Override
    public Dog findDogByPic(String dogPicUrl) {
        if(dogsMap != null && dogsMap.containsKey(dogPicUrl)){
            return  dogsMap.get(dogPicUrl);
        }
        return null;
    }

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
