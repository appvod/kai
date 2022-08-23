package com.kai.conf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.kai.network.GwApi;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.util.concurrent.TimeUnit;

@Configuration
public class GwApiConfig {

    private final static String HOST = "https://m.zuche.com/api";

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    @Qualifier("gwApiRetrofit")
    private Retrofit gwApiRetrofit;

    @Bean(name = "gwApiRetrofit")
    public Retrofit getGwApiRetrofit() {
        ConnectionPool connectionPool = new ConnectionPool(100, 5L, TimeUnit.MINUTES);
        OkHttpClient client = new OkHttpClient.Builder().connectionPool(connectionPool).build();
        client.dispatcher().setMaxRequests(64);
        client.dispatcher().setMaxRequestsPerHost(64);
        return new Retrofit.Builder()
                .baseUrl(HOST)
                .client(client)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Bean(value = "gwApi")
    public GwApi getZhptApi() {
        return gwApiRetrofit.create(GwApi.class);
    }

}
