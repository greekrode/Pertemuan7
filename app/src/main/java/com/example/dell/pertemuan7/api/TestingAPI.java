package com.example.dell.pertemuan7.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import com.example.dell.pertemuan7.MyDeserializer;
import com.example.dell.pertemuan7.api.Model.Repo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.Streams;

import java.lang.reflect.Modifier;


/**
 * Created by roder on 7/26/2017.
 */

public class TestingAPI {
    private static String baseUrl = "https://api.github.com";
    private static Retrofit retrofit = null;

    private static Gson gson = new GsonBuilder()
            .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setDateFormat("yyy-MM-dd'T'HH:mm:ssZ")
            .create();

    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl(baseUrl)
                    .build();
        }
        return retrofit;
    }
}
