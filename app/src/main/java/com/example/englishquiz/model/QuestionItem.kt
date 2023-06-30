package com.example.englishquiz.model

//data class QuestionItem(
//    val correct_answer: String,
//    val options: List<String>,
//    val question: String
//)

import com.google.gson.annotations.SerializedName

data class QuestionItem(
    @SerializedName("correct_answer")
    val correctAnswer: String,
    @SerializedName("options")
    val options: List<String>,
    @SerializedName("question")
    val question: String
)