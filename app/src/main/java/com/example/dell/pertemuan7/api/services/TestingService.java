package com.example.dell.pertemuan7.api.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import com.example.dell.pertemuan7.api.Model.Repo;
import com.example.dell.pertemuan7.api.Model.Item;
import com.example.dell.pertemuan7.api.Model.RepoResult;

import java.util.List;


/**
 * Created by roder on 7/26/2017.
 */

public interface TestingService {
    @GET("search/repositories")
    Call<RepoResult> listReposSearch(@Query("q") String q, @Query("sort") String sort, @Query("order") String order, @Query("page") String page, @Query("per_page") String perPage);

}