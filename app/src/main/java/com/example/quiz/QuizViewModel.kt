package com.example.quiz

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"
class QuizViewModel : ViewModel() {
    init {
        Log.d(TAG, "Instancia de ViewModel creada")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel esta siendo destruido")
    }
}

