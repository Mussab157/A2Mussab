package com.example.a2mussab.data;

import com.example.a2mussab.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

    List<Movie> findByTitleContainingIgnoreCase(String title);
    List<Movie> findByGenreIgnoreCase(String genre);
}