package com.disney.service;

import com.disney.database.DataLoader;
import com.disney.database.DatabaseClass;
import com.disney.model.Breed;
import com.disney.model.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by slowell on 2/19/17.
 */
@Service
public class BreedService implements IBreedService {
    private Map<String, Breed> breedsMap = DatabaseClass.getBreedsMap();

    public BreedService(){
        DataLoader.getInstance();
    }

    @Override
    public List<Breed> listAllDogsByAllBreeds() {
        if(breedsMap != null && breedsMap.size()>0)
            return new ArrayList<>(breedsMap.values());
        return null;
    }

    @Override
    public List<Dog> listDogsForBreed(String breedName) {
        if(breedsMap != null && breedsMap.size()>0){
            if(breedsMap.containsKey(breedName)){
                Breed breed = breedsMap.get(breedName);
                if(breed != null && breed.getDogs()!= null)
                    return new ArrayList<>(breed.getDogs());
            }
        }
        return null;
    }
}
