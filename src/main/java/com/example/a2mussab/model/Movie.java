package com.example.a2mussab.model;


public class Movie {
    private int id;
    private String title;
    private String genre;
    private int date;
    private int rating;
    private String director;
    private int durationMinutes;

    public Movie(int id, String title, String genre, int date, int rating, String director, int durationMinutes) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.date = date;
        this.rating = rating;
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public Movie() {
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


