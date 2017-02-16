package com.example.ssdk.mydictionary;

/**
 * Created by SatyaSaiDeepthi on 2/15/2017.
 */

import android.content.Context;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

public class RestClient implements RequestInterceptor {

    private static final String BASE_URL = "https://wordsapiv1.p.mashape.com";
    private RestInterface enforceSerVices;

    public static RestClient getInstance() {
        return new RestClient();

    }


    /**
     * Creating rest adapter
     *
     * @param context
     */
    public RestInterface getServiceSample(Context context) {
        final String basrUrl = BASE_URL;
        retrofit.client.UrlConnectionClient urlClient = new retrofit.client.UrlConnectionClient();
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(basrUrl)
                .setLogLevel(RestAdapter.LogLevel.FULL).setRequestInterceptor(this)
                .setClient(urlClient).build();
        enforceSerVices = restAdapter.create(RestInterface.class);
        return enforceSerVices;
    }


    @Override
    public void intercept(RequestFacade request) {

        //do nothing
    }
}
