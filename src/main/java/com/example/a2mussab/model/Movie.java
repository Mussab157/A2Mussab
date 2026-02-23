package com.example.a2mussab.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;
import jakarta.validation.constraints.NotBlank;

import java.util.List;


@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    private String title;

    @NotBlank
    private String genre;

    @NotBlank
    private int date;
    private int rating;

    @NotBlank
    private String director;

    @NotBlank
    private int durationMinutes;

    @NotBlank

    public Movie() {
    }

    public Movie(int id, String title, String genre, int date, int rating, String director, int durationMinutes) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.date = date;
        this.rating = rating;
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public Movie(String title, String genre, int date, int rating, String director, int durationMinutes) {
        this.title = title;
        this.genre = genre;
        this.date = date;
        this.rating = rating;
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    // Inside Movie.java
    public static List<Movie> getDefaultMovies() {
        return List.of(
                new Movie("Inception", "Sci-Fi", 2010, 9, "Christopher Nolan", 148),
                new Movie("The Dark Knight", "Action", 2008, 10, "Christopher Nolan", 152),
                new Movie("Interstellar", "Sci-Fi", 2014, 9, "Christopher Nolan", 169)
        );
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}


