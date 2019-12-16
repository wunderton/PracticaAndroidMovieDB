package com.example.wundertonmoviees.service;

import com.example.wundertonmoviees.model.DiscoverDBResponse;
import com.example.wundertonmoviees.model.GenresListDBResponse;
import com.example.wundertonmoviees.model.MovieDBResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    //@GET("movie/popular")
    //Call<MovieDBResponse> getPopularMovies(@Query("api_key")String apiKey, @Query("page")int pageIndex);

    @GET("movie/popular")
    Observable<MovieDBResponse> getPopularMoviesWithRx(@Query("api_key")String apiKey, @Query("page")int pageIndex);

    @GET("movie/top_rated")
    Observable<MovieDBResponse> getTopRatedMoviesWithRx(@Query("api_key")String apiKey, @Query("page")int pageIndex);

    @GET("genre/movie/list")
    Observable<GenresListDBResponse> getGenresList(@Query("api_key")String apiKey);

    @GET("discover/movie")
    Observable<DiscoverDBResponse> discover(@Query("api_key")String apiKey, @Query("with_genres")String genres, @Query("include_adult")Boolean adult, @Query("include_video")Boolean video, @Query("page")int pageIndex);

    @GET("search/movie")
    Observable<DiscoverDBResponse> search(@Query("api_key")String apiKey, @Query("include_adult")Boolean adult,@Query("query")String query);
}
