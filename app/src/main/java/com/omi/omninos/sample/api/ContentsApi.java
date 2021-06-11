package com.omi.omninos.sample.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ContentsApi {

//    @GET("/api/v3/{api_key}")
//    Call<ContentsResponse> getContents(@Path("api_key") String apiKey);

    @GET("/api/v3/dd0ac6ea7d230175f0dd3ee6?dev=true")
    Call<ContentsResponse> getContents1();
}
