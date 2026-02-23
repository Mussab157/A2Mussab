package com.example.a2mussab.controller;

import com.example.a2mussab.model.Movie;
import com.example.a2mussab.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) { this.movieService = movieService; }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Mussab");
        model.addAttribute("studentId", "991XXXXXX");
        return "index";
    }

    @GetMapping("/movies")
    public String showMovieList(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());
        return "list";
    }

    @GetMapping("/movies/add")
    public String showAddForm(Model model) {
        model.addAttribute("movie", new Movie());
        return "formPage";
    }

    @GetMapping("/movies/search")
    public String searchMovies(@RequestParam(required = false) String title,
                               @RequestParam(required = false) String genre,
                               Model model) {

        List<Movie> results;

        if (title != null && !title.isEmpty()) {
            results = movieService.searchByTitle(title);
        } else if (genre != null && !genre.isEmpty()) {
            results = movieService.searchByGenre(genre);
        } else {
            results = movieService.getAllMovies();
        }

        model.addAttribute("movies", results);
        model.addAttribute("title", title);
        model.addAttribute("genre", genre);
        return "list";
    }

    @PostMapping("/movies/save")
    public String saveMovie(@Valid @ModelAttribute Movie movie, BindingResult result) {
        if (result.hasErrors()) return "formPage";
        movieService.saveMovie(movie);
        return "redirect:/movies";
    }

    @GetMapping("/movies/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Movie movie = movieService.getMovieById(id);
        if (movie == null) return "redirect:/movies";
        model.addAttribute("movie", movie);
        return "formPage";
    }

    @GetMapping("/movies/delete/{id}")
    public String deleteMovie(@PathVariable int id) {
        movieService.deleteMovie(id);
        return "redirect:/movies";


    }
}