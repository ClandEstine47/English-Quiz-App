package com.example.englishquiz

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.englishquiz.screen.QuestionsViewModel
import com.example.englishquiz.ui.theme.EnglishQuizTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnglishQuizTheme {
                QuizHome()
            }
        }
    }
}

@Composable
fun QuizHome(viewModel: QuestionsViewModel = hiltViewModel()) {
    Questions(viewModel)
}

@Composable
fun Questions(viewModel: QuestionsViewModel) {

    val questions = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true) {
        CircularProgressIndicator()
        Log.d("load", "Questions: Loading")
    } else {
        Log.d("stop_load", "Questions: loading stopped")
        questions?.forEach{ questionitem ->
            Log.d("Questions", "Questions: ${questionitem.question}")
        }
    }
}