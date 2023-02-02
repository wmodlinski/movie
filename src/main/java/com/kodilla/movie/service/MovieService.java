package com.kodilla.movie.service;

import com.kodilla.movie.controller.MovieNotFoundException;
import com.kodilla.movie.domain.Movie;
import com.kodilla.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    MovieRepository movieRepository;
    
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    public Movie findMovieById(Long movieId) throws MovieNotFoundException {
        return movieRepository.findById(movieId).orElseThrow(MovieNotFoundException::new);
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    public Movie updateMovie(Movie movie, Movie movie1) throws MovieNotFoundException {

    }
}
