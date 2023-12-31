package com.example.englishquiz.network

import com.example.englishquiz.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {

    @GET("quizList.json")
    suspend fun getAllQuestions(): Question
}
