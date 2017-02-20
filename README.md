This project is developed utilizing:
Jersey + JAX-RS
Spring Integration
in memory data storage using maps
maven for build
junit for test cases

Here is the list of Rest services exposed:
(postman url: https://www.getpostman.com/collections/911a5d0e5aa3908b57a3)
ListDogsByBreed: http://localhost:8080/doghouse/web/breed/listDogs/breedName/pug
ListDogsGroupByBreed: http://localhost:8080/doghouse/web/breed/listDogs
FindDogByPic: http://localhost:8080/doghouse/web/dog/findDog/dogPicUrl/ozJD7SC.png
UpVoteDog: http://localhost:8080/doghouse/web/dog/upVote
DownVoteDog: http://localhost:8080/doghouse/web/dog/downVote