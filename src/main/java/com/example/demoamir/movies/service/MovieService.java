package com.example.demoamir.movies.models.service;


import com.example.demoamir.movies.models.Movie;
import com.example.demoamir.movies.repositories.MovieRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository movieRepository;


    // Find by id
    public Movie findById (int id){
        Optional<Movie> findByMovieId = movieRepository.findById(id);
        return  findByMovieId.orElse(null);
    }


    // Find all
    public List<Movie> findAll(PageRequest of){
        return  movieRepository.findAll();
    }

    // Delete by id
    public int deleteById(int id){

        if(! movieRepository.existsById(id)){
            return  0;
        } else {

            movieRepository.deleteById(id);
        }

        return id;
    }

}
