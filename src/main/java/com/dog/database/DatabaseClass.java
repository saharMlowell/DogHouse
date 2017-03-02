package com.dog.database;

import java.util.HashMap;
import java.util.Map;
import com.dog.model.Breed;
import com.dog.model.Dog;

/**
 * Created by slowell on 2/19/17.
 */
public class DatabaseClass {
    static Map<String, Breed> breedsMap = new HashMap<>(); //map breed name to breed
    static Map<String, Dog> dogMap = new HashMap<>(); //map pic url to dog

    public static Map<String, Breed> getBreedsMap() {
        return breedsMap;
    }

    public static Map<String, Dog> getDogMap() {
        return dogMap;
    }
}
