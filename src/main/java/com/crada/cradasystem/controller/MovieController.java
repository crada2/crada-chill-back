package com.crada.cradasystem.controller;

import com.crada.cradasystem.model.Movie;
import com.crada.cradasystem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping
    public String add(@RequestBody Movie movie){
        movieService.saveMovie(movie);
        return "new movie is added";
    }
    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
}
