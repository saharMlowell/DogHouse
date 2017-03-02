package com.dog.database;

import com.dog.model.Breed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import com.dog.model.Dog;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by slowell on 2/19/17.
 */
public class DataLoader {
    private Map<String, Breed> breedsMap = DatabaseClass.getBreedsMap();
    private Map<String, Dog> dogMap = DatabaseClass.getDogMap();

    private static final DataLoader instance = new DataLoader();

    public static DataLoader getInstance() {
        return instance;
    }

    private DataLoader() {
        try {
            loadBreed("labradors", new File(String.valueOf(getClass().getResource("/data/labrador.txt").getFile())));
            loadBreed("pug", new File(String.valueOf(getClass().getResource("/data/pug.txt").getFile())));
            loadBreed("retriever", new File(String.valueOf(getClass().getResource("/data/retriever.txt").getFile())));
            loadBreed("yorkie", new File(String.valueOf(getClass().getResource("/data/yorkie.txt").getFile())));
        }catch (IOException e){

        }
    }

    /**
     * Load dogs and initialize breadMap and dogMap
     * @param breed
     * @param file
     * @throws IOException
     */
    private void loadBreed(String breed, File file) throws IOException {
        try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            List<Dog> dogs = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                Dog dog = new Dog(line, 0, 0, breed);
                dogs.add(dog);
                String dogMapKey = line.substring(line.indexOf("com/")+4);
                dogMap.put(dogMapKey, dog);
            }
            breedsMap.put(breed, new Breed(breed, dogs));
        }
    }

}
