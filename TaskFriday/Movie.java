package com.TaskSaturday;
import java.util.*;

public class Movie implements Comparable<Movie> {
    private String name;
    private String language;
    private String releaseDate;
    private String director;
    private String producer;
    private int duration; 

    public Movie(String name, String language, String releaseDate, String director, String producer, int duration) {
        this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        return this.language.compareTo(otherMovie.language);
    }

    @Override
    public String toString() {
        return "Movie{name='" + name + "', language='" + language + "', releaseDate='" + releaseDate + "', director='" + director + "', producer='" + producer + "', duration=" + duration + "}";
    }
    public static Comparator<Movie> DirectorComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            return movie1.getDirector().compareTo(movie2.getDirector());
        }
    };
}

