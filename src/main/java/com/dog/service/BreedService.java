package com.dog.service;

import com.dog.database.DataLoader;
import com.dog.database.DatabaseClass;
import com.dog.model.Breed;
import com.dog.model.Dog;
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

    /**
     * List all Dog info group by breeds
     *
     * @return
     */
    @Override
    public List<Breed> listAllDogsByAllBreeds() {
        if(breedsMap != null && breedsMap.size()>0)
            return new ArrayList<>(breedsMap.values());
        return null;
    }

    /**
     * List all Dogs info for a specific breed
     *
     * @param breedName
     * @return
     */
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
