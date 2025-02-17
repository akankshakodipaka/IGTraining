package com.TaskSaturday;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieService {

    public List<Movie> createMovieSet() {
        List<Movie> movieList = new ArrayList<>();
        // Adding some sample movies to the list
        movieList.add(new Movie("Movie1", "English", "2024-01-01", "Director A", "Producer X", 120));
        movieList.add(new Movie("Movie2", "Hindi", "2023-05-05", "Director C", "Producer Y", 150));
        movieList.add(new Movie("Movie3", "English", "2025-07-10", "Director B", "Producer Z", 135));
        movieList.add(new Movie("Movie4", "Tamil", "2022-11-20", "Director A", "Producer X", 125));
        return movieList;
    }

    // Method to sort the movies by language (using Comparable)
    public void sortByLanguage(List<Movie> movieList) {
        Collections.sort(movieList);
    }

    // Method to sort the movies by director (using Comparator)
    public void sortByDirector(List<Movie> movieList) {
        Collections.sort(movieList, Movie.DirectorComparator);
    }

    // Method to sort the movies by duration (using Comparator)
    public void sortByDuration(List<Movie> movieList) {
        Collections.sort(movieList, new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return Integer.compare(movie1.getDuration(), movie2.getDuration());
            }
        });
    }

    // Method to display the movies
    public void displayMovies(List<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
