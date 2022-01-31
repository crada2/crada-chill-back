package com.crada.cradasystem.controller;

import com.crada.cradasystem.model.Movie;
import com.crada.cradasystem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.security.PublicKey;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movies")
@CrossOrigin
public class MovieController
{
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

     @GetMapping("/{id}")
         public ResponseEntity<Movie> get(@PathVariable Integer id)
     {
         try {
           Movie movie = movieService.get(id);
             return new ResponseEntity<Movie>(movie, HttpStatus.OK);
         }
         catch (NoSuchElementException e) {
             return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
         }
     }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> update (@RequestBody Movie movie, @PathVariable Integer id){
        try{
            Movie existingMovie=movieService.get(id);
            movieService.save(movie);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return new ResponseEntity<Movie>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        movieService.delete(id);
        return "Removed movie with id: "+id;
    }

}

