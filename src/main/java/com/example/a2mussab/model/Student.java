package com.example.a2mussab.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Student {

    @Id
    private int id;

    @NotBlank
    private String name;

    @ManyToMany
    @JoinTable(
            name = "student_movies",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
    )
    private List<Movie> movies;


    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }


    public List<Movie> getMovie()
    {
        return movies;
    }

    public void setMovie(Movie movie)
    {
        this.movies = movies;
    }
}
