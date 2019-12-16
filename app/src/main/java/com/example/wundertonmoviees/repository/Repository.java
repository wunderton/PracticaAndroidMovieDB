package com.example.wundertonmoviees.repository;

import android.app.Application;

import com.example.wundertonmoviees.db.Database;
import com.example.wundertonmoviees.db.FavouriteMoviesDAO;
import com.example.wundertonmoviees.model.Movie;

import java.util.List;

import androidx.lifecycle.LiveData;

public class Repository {
    private FavouriteMoviesDAO favouriteMoviesDAO;
    public Repository(Application application)
    {
        Database database=Database.getInstance(application);
        favouriteMoviesDAO=database.getFDAO();

    }

    public LiveData<List<Movie>> getAllFMovies()
    {
        return favouriteMoviesDAO.getAllFMovies();
    }

    public Movie getMovie(String id)
    {
        return favouriteMoviesDAO.getMovie(id);
    }
    public void AddMovie(Movie movie)
    {

        new AddFMovie(favouriteMoviesDAO).execute(movie);
    }

    public void DeleteMovie(Movie movie)
    {
            new DeleteFMovie(favouriteMoviesDAO).execute(movie);
    }

}
