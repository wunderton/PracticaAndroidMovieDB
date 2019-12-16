package com.example.wundertonmoviees.repository;

import android.os.AsyncTask;

import com.example.wundertonmoviees.db.FavouriteMoviesDAO;
import com.example.wundertonmoviees.model.Movie;

public class DeleteFMovie extends AsyncTask<Movie, Void,Void> {
    private FavouriteMoviesDAO favouriteMoviesDAO;

    public DeleteFMovie(FavouriteMoviesDAO favouriteMoviesDAO) {
        this.favouriteMoviesDAO = favouriteMoviesDAO;
    }

    @Override
    protected Void doInBackground(Movie... movies) {
        favouriteMoviesDAO.deleteFMovie(movies[0]);
        return null;
    }
}
