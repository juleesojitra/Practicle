package com.example.retrofeetpractical;

import com.example.retrofeetpractical.Model.Country;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("v3.1/all")
    Call<List<Country>> apiinterface();
}
