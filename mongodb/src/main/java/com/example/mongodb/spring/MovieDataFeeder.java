package com.example.mongodb.spring;


import com.example.mongodb.domain.Movie;
import com.example.mongodb.domain.MovieCast;
import com.example.mongodb.domain.MovieReviews;
import com.example.mongodb.repo.MovieInfoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class MovieDataFeeder implements CommandLineRunner {

    MovieInfoRepo movieInfoRepo;

    public MovieDataFeeder(MovieInfoRepo movieInfoRepo) {
        this.movieInfoRepo = movieInfoRepo;
    }

/*    public MovieInfoRepo getMovieInfoRepo() {
        return movieInfoRepo;
    }

    public void setMovieInfoRepo(MovieInfoRepo movieInfoRepo) {
        this.movieInfoRepo = movieInfoRepo;
    }*/

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Data Feeder is started ");

        this.movieInfoRepo.deleteAll();
        System.out.println("deleted the existing documents");

        String[] category = new String[10];
        category[0]= "thriller";
        category[1]= "Action";

        String[] castAsuran = new String[10];
        castAsuran[0]= "VetriMaran";
        castAsuran[1]= "Dhanush";
        castAsuran[1]= "G.V";
        //add the list of Movies to MongoDB.
        Movie asuranMovieVar = new Movie("asuran",category , new Date(),19.23, "tamil",new MovieCast(castAsuran),
                Arrays.asList(new MovieReviews("imdb" , 8,"Good Family entertainer",Boolean.TRUE)));
        String[] castKaithi = new String[10];
        castKaithi[0]= "Lokesh";
        castKaithi[1]= "Karthi";
        castKaithi[1]= "Imman";
        Movie  kaithiovieVar = new Movie("kaithi",category , new Date(),29.23, "tamil",new MovieCast(castKaithi),
                Arrays.asList(new MovieReviews("imdb" , 9,"Good Family entertainer",Boolean.TRUE)));

        //For bigil Movie
        String[] categoryBigil = new String[10];
        categoryBigil[0]= "FamilyDrama";
        categoryBigil[1]= "Action";

        String[] castBigil = new String[10];
        castBigil[0]= "A.R.R";
        castBigil[1]= "Vijay";
        castBigil[1]= "atlee";
        Movie bigilMovieVar = new Movie("bigil",categoryBigil , new Date(),49.23, "tamil",new MovieCast(castBigil),
                Arrays.asList(new MovieReviews("imdb" , 8,"Good Family entertainer",Boolean.TRUE)));

        List<Movie> movieList = new ArrayList<>();
        movieList.add(asuranMovieVar);
        movieList.add(kaithiovieVar);
        movieList.add(bigilMovieVar);

        System.out.println("Documents saving is started ");
        this.movieInfoRepo.saveAll(movieList);
        System.out.println("Saved all the documents successfully ");


    }
}
