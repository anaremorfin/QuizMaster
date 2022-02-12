package com.example.quiz

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

//import androidx.lifecycle.ViewModelProvider

//import androidx.lifecycle.ViewModelProvider

private const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {
    //Text changes
    private lateinit var questionTextView : TextView
    private lateinit var option1Button : Button
    private lateinit var option2Button : Button
    private lateinit var option3Button : Button
    private lateinit var option4Button : Button
    private lateinit var correctScore : TextView
    private lateinit var incorrectScore : TextView
    private lateinit var photoB : Button

    /*Text remains the same
    No function, just text:
    textViewCorrect
    textViewIncorrect
    textViewCategories
    buttonClear

    With function:
    buttonRestart
    buttonPhoto
    buttonSurf
    buttonBinary
    buttonMountains
    buttonMovies
    */

    private val modeloQuiz = ModeloQuiz()
    //val provider : ViewModelProvider = ViewModelProvider(this)
    //val quizViewModel = provider.get(QuizViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionTextView = findViewById(R.id.textViewQuestion)
        option1Button = findViewById(R.id.buttonOption1)
        option2Button = findViewById(R.id.buttonOption2)
        option3Button = findViewById(R.id.buttonOption3)
        option4Button = findViewById(R.id.buttonOption4)
        correctScore = findViewById(R.id.textViewCorrectN)
        incorrectScore = findViewById(R.id.textViewIncorrectN)
        photoB = findViewById(R.id.buttonPhoto)

        //@Suppress("UNUSED_PARAMETER")

        photoB.setOnClickListener {
            this.questionTextView.text = modeloQuiz.questionPhoto()
            val numbers = mutableListOf(0,1,2,3)
            var randomNumber = numbers.random()
            this.option1Button.text = modeloQuiz.getListAnswersPhoto()[randomNumber]
            this.option1Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option2Button.text = modeloQuiz.getListAnswersPhoto()[randomNumber]
            this.option2Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option3Button.text = modeloQuiz.getListAnswersPhoto()[randomNumber]
            this.option3Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option4Button.text = modeloQuiz.getListAnswersPhoto()[randomNumber]
            this.option4Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
        }

        Log.d(TAG,"En onCreate()")
    }

    @SuppressLint("SetTextI18n")
    fun verifyAnswer(optionButton: View){
        val selectedOption : Button = optionButton as Button
        if(selectedOption.text == modeloQuiz.getListAnswersPhoto()[0])
        {
            selectedOption.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
            selectedOption.text = "That's right!"
            val toastCorrect = Toast.makeText(applicationContext, "You are correct!!!", Toast.LENGTH_LONG)
            toastCorrect.show()
        }
        else
        {
            selectedOption.setBackgroundColor(Color.parseColor("#FFFFAA95"))
            selectedOption.text = "Oh no..."
            val toastIncorrect = Toast.makeText(applicationContext, "Incorrect", Toast.LENGTH_LONG)
            toastIncorrect.show()
            if(this.option1Button.text == modeloQuiz.getListAnswersPhoto()[0])
            {
                option1Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
            }
            if(this.option2Button.text == modeloQuiz.getListAnswersPhoto()[0])
            {
                option2Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
            }
            if(this.option3Button.text == modeloQuiz.getListAnswersPhoto()[0])
            {
                option3Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
            }
            if(this.option4Button.text == modeloQuiz.getListAnswersPhoto()[0])
            {
                option4Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
            }
        }
    }

}

