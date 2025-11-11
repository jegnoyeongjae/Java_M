package day1107_Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(int movieId) {
        movies.removeIf(m -> m.getMovieId() == movieId);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Movie getMovieById(int movieId) {
        for (Movie m : movies) {
            if (m.getMovieId() == movieId) return m;
        }
        return null;
    }

    public void printMovies() {
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
	
}
