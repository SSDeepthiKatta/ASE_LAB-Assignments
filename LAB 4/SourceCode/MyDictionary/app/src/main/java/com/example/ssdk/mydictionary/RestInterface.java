package com.example.ssdk.mydictionary;

/**
 * Created by SatyaSaiDeepthi on 2/15/2017.
 */
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Path;

public interface RestInterface {

    @GET("/words/{word}/definitions")
    @Headers("X-Mashape-Key : SEx2h4btKAmshMaOcdfuPisFqoKdp16iyDEjsnGKLV0pxu4sOJ")
    void sendDatainURL(@Path("word")String word, @Header("Accept") String contentType , Callback<DefResponse> callback);
}