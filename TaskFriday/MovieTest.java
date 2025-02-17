package com.TaskSaturday;

import java.util.List;

public class MovieTest {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        
        // Create the movie list
        List<Movie> movieList = movieService.createMovieSet();

        System.out.println("Movies before sorting:");
        movieService.displayMovies(movieList);

        // Sort movies by language
        movieService.sortByLanguage(movieList);
        System.out.println("\nMovies sorted by language:");
        movieService.displayMovies(movieList);

        // Sort movies by director
        movieService.sortByDirector(movieList);
        System.out.println("\nMovies sorted by director:");
        movieService.displayMovies(movieList);

        // Sort movies by duration
        movieService.sortByDuration(movieList);
        System.out.println("\nMovies sorted by duration:");
        movieService.displayMovies(movieList);
    }
}
