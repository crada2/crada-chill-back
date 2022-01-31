package com.crada.cradasystem.service;

import com.crada.cradasystem.model.Movie;
import com.crada.cradasystem.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie get(Integer id) {
    return movieRepository.findById(id).get();
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void delete (Integer id){
        movieRepository.deleteById(id);
    }
}
