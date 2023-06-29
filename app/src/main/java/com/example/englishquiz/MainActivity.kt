package com.example.englishquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.englishquiz.screen.QuestionsViewModel
import com.example.englishquiz.ui.theme.EnglishQuizTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EnglishQuizTheme {
                
            }
        }
    }
}

@Composable
fun QuizHome(viewModel: QuestionsViewModel) {
    
}

@Composable
fun Questions(viewModel: QuestionsViewModel) {

}