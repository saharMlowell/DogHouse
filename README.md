# API
Design and create a RESTful API that could be used to manage a list of dog images.

# Requirements
The operations would be:

* List all of the available dog pictures grouped by breed
* List all of the available dog pictures of a particular breed
* Vote up and down a dog picture
* The details associated with a dog picture

The information the Dog Breed App needs to function is:

* A URL to a dog picture
* The number of time the picture was favorited
* The dog's breed
* Any other information required to identify a specific dog


The API responses must be in JSON.

## Additional Voting Requirements

Each client is allowed to vote once for any particular dog picture.

## Dependencies
This project is developed utilizing:
for Web services: by JAX-RS
Spring Jersey
for database: in memory data storage using maps
maven for build
junit for test cases

## Run
Here is the list of Rest services exposed:
(postman url: https://www.getpostman.com/collections/911a5d0e5aa3908b57a3)
ListDogsByBreed: http://localhost:8080/doghouse/web/breed/listDogs/breedName/pug
ListDogsGroupByBreed: http://localhost:8080/doghouse/web/breed/listDogs
FindDogByPic: http://localhost:8080/doghouse/web/dog/findDog/dogPicUrl/ozJD7SC.png
UpVoteDog: http://localhost:8080/doghouse/web/dog/upVote
DownVoteDog: http://localhost:8080/doghouse/web/dog/downVote