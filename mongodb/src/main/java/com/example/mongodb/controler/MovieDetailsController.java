package com.example.mongodb.controler;


import com.example.mongodb.domain.Movie;
import com.example.mongodb.repo.MovieInfoRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Movies")
public class MovieDetailsController {

    public MovieInfoRepo movieInfoRepo;

    public MovieDetailsController(MovieInfoRepo movieInfoRepo) {
        this.movieInfoRepo = movieInfoRepo;
    }

    @GetMapping("/allDetails")
    public  List<Movie> getAllMovies(){
        System.out.println("Get all movies info successPath");
        System.out.println("Get All Movies is started ");
        List<Movie> moviesList = this.movieInfoRepo.findAll();
        System.out.println("retrieved movies list and size : "+moviesList.size());
        return moviesList;
    //    return "SuccessPath";
    }


    @PutMapping()
    public  String saveMovie(@RequestBody Movie movieInfo){
        System.out.println("saveMovie successPath");
        System.out.println("saveMovie movie request started ::  "+movieInfo);
        this.movieInfoRepo.save(movieInfo);
        return "SuccessPath";
    }
}
