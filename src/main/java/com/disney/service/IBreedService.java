package com.disney.service;

import com.disney.model.Breed;
import com.disney.model.Dog;
import java.util.List;

/**
 * Created by slowell on 2/19/17.
 */
public interface IBreedService {
    List<Breed> listAllDogsByAllBreeds();
    List<Dog> listDogsForBreed(String breedName);
    Breed addBreed(Breed breed);
    Breed updateBreed(Breed breed);
    Breed removeBreed(String breedName);
}
