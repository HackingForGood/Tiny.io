package com.example.linh.nutritrak;


import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.*;

import retrofit2.http.Headers;
/**
 * Created by linh on 6/17/17.
 */

public interface NutritionFactService {
    @POST("v2/natural/nutrients")
    @Headers({"Content-Type:application/json", "x-app-id:be1a044e", "x-app-key:9c39f6f80fef797c6fb7e8d0553f7a5f", "x-remote-user-id:1"})
    Call<ResponseBody> getNutrition(@Body Food f);
}
