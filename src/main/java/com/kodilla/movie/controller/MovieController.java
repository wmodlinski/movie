package com.kodilla.movie.controller;

import com.kodilla.movie.domain.Movie;
import com.kodilla.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List findAllMovies() {
        return movieService.findAllMovies();
    }

    @GetMapping("/{movieId}")
    public Movie findMovie(@PathVariable Long movieId) {
        return movieService.findMovieById(movieId);
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @DeleteMapping("/{movieId}")
    public void deleteBook(@PathVariable Long movieId) {
        movieService.deleteMovie(movieId);
    }

    @PutMapping("/{movieId}")
    public Movie updateMovie(@RequestBody Movie movie, @PathVariable Long movieId) {
        return movieService.updateMovie(movie, movie);
    }

    @PatchMapping("/{movieId}")
    public Movie updateMovie(
            @RequestBody Map updates,
            @PathVariable Long movieId) {
        return movieService.updateMovie(updates, movieId);
    }
}