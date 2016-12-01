package com.example.rogerh.retrofit_5hteam.rest;

import com.example.rogerh.retrofit_5hteam.model.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
/**
 * Created by rogerh on 12/1/2016.
 */

public interface ApiInterface {

    // Định nghĩa endpoint cho các movie top thông qua hàm getTopRatedMovies, hàm nhận thông số
    // đầu vào là apiKey sẽ được sử dụng để request bằng cách: @Query
    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    // Định nghĩa endpoint để truy cập thông tin cụ thể của một moive thông qua id kèm Apikey
    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
