package com.dog.service;

import com.dog.model.Breed;
import com.dog.model.Dog;
import java.util.List;

/**
 * Created by slowell on 2/19/17.
 */
public interface IBreedService {
    List<Breed> listAllDogsByAllBreeds();
    List<Dog> listDogsForBreed(String breedName);
}
