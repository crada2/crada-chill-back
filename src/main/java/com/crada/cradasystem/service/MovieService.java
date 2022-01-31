package com.crada.cradasystem.service;

import com.crada.cradasystem.model.Movie;

import java.util.List;

public interface MovieService {
    public Movie saveMovie(Movie movie);
    public List<Movie> getAllMovies();

    public Movie get(Integer id);

    public Movie save (Movie movie);

    public void delete (Integer id);

    }