package com.disney.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by slowell on 2/19/17.
 */
@XmlRootElement
public class Dog {
    String picUrl;
    int upVotes;
    int downVotes;
    String breedName;

    public Dog() {
    }

    public Dog(String picUrl, int upVotes, int downVotes, String breedName) {
        this.picUrl = picUrl;
        this.upVotes = upVotes;
        this.downVotes = downVotes;
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public Dog(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }
}
