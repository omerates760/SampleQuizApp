package com.monofire.mvvmdatabindinglivedata.Network

import com.monofire.mvvmdatabindinglivedata.Model.QuestionsModel
import retrofit2.Call
import retrofit2.http.GET


interface service {


    @GET("json/questions.json")
    fun getQuestions(): Call<List<QuestionsModel>>
}