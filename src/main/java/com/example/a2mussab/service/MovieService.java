package com.example.a2mussab.service;


import com.example.a2mussab.data.MovieRepo;
import com.example.a2mussab.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    MovieRepo movieRepo;

    public MovieService(MovieRepo movieRepo)
    {
        this.movieRepo = movieRepo;
    }
    // CRUD OPERATIONS HERE
    public List<Movie> getAllMovies()
    {
        return movieRepo.findAll();
    }

    public void addMovie(Movie movie)
    {
        movieRepo.save(movie);
    }

    public void saveMovie(Movie movie) {
        movieRepo.save(movie);
    }

    public Movie getMovieById(int id) {
        // Check if the movie exists in the database first
        if (movieRepo.existsById(id)) {
            // If it exists, return the movie object
            return movieRepo.findById(id).get();
        }
        // If it doesn't exist, return null
        return null;
    }

    public void deleteMovie(Movie movie)
    {
        movieRepo.delete(movie);
    }

    public void deleteMovie(int id) {
        movieRepo.deleteById(id);
    }

    public List<Movie> searchByTitle(String title) {
        return movieRepo.findByTitleContainingIgnoreCase(title);
    }


    public List<Movie> searchByGenre(String genre) {
        return movieRepo.findByGenreIgnoreCase(genre);
    }
}
