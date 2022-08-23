package com.kai.network;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GwApi {

    @POST("/gw.do")
    Call<String> gw(@Query("uri") String uri);

}
