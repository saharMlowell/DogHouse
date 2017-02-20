package com.disney.service;

import com.disney.model.Dog;

/**
 * Created by slowell on 2/19/17.
 */
public interface IDogService {
    Dog findDogByPic(String dogPicUrl);
    Dog updateUpVoteDog(String dogPicUrl);
    Dog updateDownVoteDog(String dogPicUrl);
}
