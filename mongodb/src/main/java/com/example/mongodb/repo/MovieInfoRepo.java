package com.example.mongodb.repo;


import com.example.mongodb.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInfoRepo extends MongoRepository<Movie, Long> {


}
