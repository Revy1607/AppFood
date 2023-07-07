package com.datnt.appfood.retrofit

import com.datnt.appfood.data.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {

    @GET("random.php")
    fun getRandomMeal(): Call<MealList>
}