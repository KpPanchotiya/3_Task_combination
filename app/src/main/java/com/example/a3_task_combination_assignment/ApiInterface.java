package com.example.a3_task_combination_assignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/v3/PublicHolidays/2017/AT")
    Call<List<Post>> getDetails();
}
