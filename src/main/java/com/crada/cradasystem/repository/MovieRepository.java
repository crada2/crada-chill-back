package com.crada.cradasystem.repository;

import com.crada.cradasystem.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <Movie,Integer>{

}
//si hay mas repositorios hay que decir cual quieres que se implemente