package com.disney.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by slowell on 2/19/17.
 */
@XmlRootElement
public class Breed {
    String breedName;

    @XmlElementWrapper(name = "dogs")
    @JsonProperty("dogs")
    @XmlElement(name="dog")
    List<Dog> dogs;

    public Breed() {
    }

    public Breed(String breedName, List<Dog> dogs) {
        this.breedName = breedName;
        this.dogs = dogs;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
}
