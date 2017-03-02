package com.dog.service;

import com.dog.model.Dog;

/**
 * Created by slowell on 2/19/17.
 */
public interface IDogService {
    Dog findDogByPic(String dogPicUrl);
    Dog updateUpVoteDog(String dogPicUrl);
    Dog updateDownVoteDog(String dogPicUrl);
}
