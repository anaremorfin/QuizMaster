/*
    @Author: Regina Morfin
    @Title: MainActivity.kt
    @Description: Contains the control logic, receiving data from the Model and displaying it on the View
*/

package com.example.quiz

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Text content will change
    private lateinit var questionTextView : TextView
    private lateinit var option1Button : Button
    private lateinit var option2Button : Button
    private lateinit var option3Button : Button
    private lateinit var option4Button : Button
    private lateinit var correctScore : TextView
    private lateinit var incorrectScore : TextView
    private lateinit var clearB : Button
    //Categories
    private lateinit var photoB : Button
    private lateinit var surfB : Button
    private lateinit var mountainsB : Button
    private lateinit var moviesB : Button
    private lateinit var binaryB : Button
    private lateinit var restartB : Button
    //Variables
    private var correctScore4display = 0
    private var incorrectScore4display = 0
    private var categorySelection = " "
    //For View only, text remains the same and no functions are linked:
    //textViewCorrect , textViewIncorrect , textViewCategories
    //Model
    private val modelQuiz = ModelQuiz()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Linking to View
        questionTextView = findViewById(R.id.textViewQuestion)
        option1Button = findViewById(R.id.buttonOption1)
        option2Button = findViewById(R.id.buttonOption2)
        option3Button = findViewById(R.id.buttonOption3)
        option4Button = findViewById(R.id.buttonOption4)
        correctScore = findViewById(R.id.textViewCorrectN)
        incorrectScore = findViewById(R.id.textViewIncorrectN)
        photoB = findViewById(R.id.buttonPhoto)
        surfB = findViewById(R.id.buttonSurf)
        mountainsB = findViewById(R.id.buttonMountains)
        moviesB = findViewById(R.id.buttonMovies)
        binaryB = findViewById(R.id.buttonBinary)
        restartB = findViewById(R.id.buttonRestart)
        clearB = findViewById(R.id.buttonClear)
        //Option buttons cannot be clicked until a category is selected
        option1Button.isClickable = false
        option2Button.isClickable = false
        option3Button.isClickable = false
        option4Button.isClickable = false
        //Clear button not shown
        this.clearB.text= " "
        clearB.isClickable = false
        clearB.isEnabled = false
        clearB.setBackgroundColor(Color.parseColor("#FFBF540B"))

        //Photo category is selected
        photoB.setOnClickListener {
            //Photo questions
            this.questionTextView.text = modelQuiz.questionPhoto()
            categorySelection = "Photo"
            //Category buttons cannot be clicked until an answer is provided
            disableCategories()
            //Random order in buttons and display text
            val numbers = mutableListOf(0,1,2,3)
            var randomNumber = numbers.random()
            this.option1Button.text = modelQuiz.getListAnswersPhoto()[randomNumber]
            this.option1Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option1Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option2Button.text = modelQuiz.getListAnswersPhoto()[randomNumber]
            this.option2Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option2Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option3Button.text = modelQuiz.getListAnswersPhoto()[randomNumber]
            this.option3Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option3Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option4Button.text = modelQuiz.getListAnswersPhoto()[randomNumber]
            this.option4Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option4Button.isClickable = true
        }

        //Surf category is selected
        surfB.setOnClickListener {
            //Surf questions
            this.questionTextView.text = modelQuiz.questionSurf()
            categorySelection = "Surf"
            //Category buttons cannot be clicked until an answer is provided
            disableCategories()
            //Random order in buttons and display text
            val numbers = mutableListOf(0,1,2,3)
            var randomNumber = numbers.random()
            this.option1Button.text = modelQuiz.getListAnswersSurf()[randomNumber]
            this.option1Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option1Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option2Button.text = modelQuiz.getListAnswersSurf()[randomNumber]
            this.option2Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option2Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option3Button.text = modelQuiz.getListAnswersSurf()[randomNumber]
            this.option3Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option3Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option4Button.text = modelQuiz.getListAnswersSurf()[randomNumber]
            this.option4Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option4Button.isClickable = true
        }

        //Mountains category is selected
        mountainsB.setOnClickListener {
            //Mountain questions
            this.questionTextView.text = modelQuiz.questionMountains()
            categorySelection = "Mountains"
            //Category buttons cannot be clicked until an answer is provided
            disableCategories()
            //Random order in buttons and display text
            val numbers = mutableListOf(0,1,2,3)
            var randomNumber = numbers.random()
            this.option1Button.text = modelQuiz.getListAnswersMountains()[randomNumber]
            this.option1Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option1Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option2Button.text = modelQuiz.getListAnswersMountains()[randomNumber]
            this.option2Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option2Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option3Button.text = modelQuiz.getListAnswersMountains()[randomNumber]
            this.option3Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option3Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option4Button.text = modelQuiz.getListAnswersMountains()[randomNumber]
            this.option4Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option4Button.isClickable = true
        }
        //Movies category is selected
        moviesB.setOnClickListener {
            //Movies questions
            this.questionTextView.text = modelQuiz.questionMovies()
            categorySelection = "Movies"
            //Category buttons cannot be clicked until an answer is provided
            disableCategories()
            //Random order in buttons and display text
            val numbers = mutableListOf(0,1,2,3)
            var randomNumber = numbers.random()
            this.option1Button.text = modelQuiz.getListAnswersMovies()[randomNumber]
            this.option1Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option1Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option2Button.text = modelQuiz.getListAnswersMovies()[randomNumber]
            this.option2Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option2Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option3Button.text = modelQuiz.getListAnswersMovies()[randomNumber]
            this.option3Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option3Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option4Button.text = modelQuiz.getListAnswersMovies()[randomNumber]
            this.option4Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option4Button.isClickable = true
        }
        //Binary category is selected
        binaryB.setOnClickListener {
            //Binary questions
            this.questionTextView.text = modelQuiz.questionBinary()
            categorySelection = "Binary"
            //Category buttons cannot be clicked until an answer is provided
            disableCategories()
            //Random order in buttons and display text
            val numbers = mutableListOf(0,1,2,3)
            var randomNumber = numbers.random()
            this.option1Button.text = modelQuiz.getListAnswersBinary()[randomNumber]
            this.option1Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option1Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option2Button.text = modelQuiz.getListAnswersBinary()[randomNumber]
            this.option2Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option2Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option3Button.text = modelQuiz.getListAnswersBinary()[randomNumber]
            this.option3Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option3Button.isClickable = true
            numbers.remove(randomNumber)
            randomNumber = numbers.random()
            this.option4Button.text = modelQuiz.getListAnswersBinary()[randomNumber]
            this.option4Button.setBackgroundColor(Color.parseColor("#FFFE9E45"))
            option4Button.isClickable = true
        }

        //Score restored to default 0-0
        restartB.setOnClickListener{
            correctScore4display=0
            incorrectScore4display=0
            correctScore.text = (correctScore4display).toString()
            incorrectScore.text = (incorrectScore4display).toString()
        }

    }

    private fun disableCategories(){
        photoB.isClickable = false
        surfB.isClickable = false
        moviesB.isClickable = false
        mountainsB.isClickable = false
        binaryB.isClickable = false
    }

    @SuppressLint("SetTextI18n")
    fun verifyAnswer(optionButton: View)
    {
        val selectedOption: Button = optionButton as Button
        option1Button.isClickable = false
        option2Button.isClickable = false
        option3Button.isClickable = false
        option4Button.isClickable = false
        //Photo category
        if(categorySelection == "Photo")
        {
            if (selectedOption.text == modelQuiz.getListAnswersPhoto()[0])
            {
                answerIsRight(optionButton)
            }
            else
            {
                answerIsWrongPhoto(optionButton)
            }
        }
        //Surf category
        if(categorySelection == "Surf")
        {
            if (selectedOption.text == modelQuiz.getListAnswersSurf()[0])
            {
                answerIsRight(optionButton)
            }
            else
            {
                answerIsWrongSurf(optionButton)
            }
        }
        //Mountains category
        if(categorySelection == "Mountains")
        {
            if (selectedOption.text == modelQuiz.getListAnswersMountains()[0])
            {
                answerIsRight(optionButton)
            }
            else
            {
                answerIsWrongMountains(optionButton)
            }
        }
        //Movies category
        if(categorySelection == "Movies")
        {
            if (selectedOption.text == modelQuiz.getListAnswersMovies()[0])
            {
                answerIsRight(optionButton)
            }
            else
            {
                answerIsWrongMovies(optionButton)
            }
        }
        //Binary category
        if(categorySelection == "Binary")
        {
            if (selectedOption.text == modelQuiz.getListAnswersBinary()[0])
            {
                answerIsRight(optionButton)
            }
            else
            {
                answerIsWrongBinary(optionButton)
            }
        }
        photoB.isClickable = true
        surfB.isClickable = true
        moviesB.isClickable = true
        mountainsB.isClickable = true
        binaryB.isClickable = true
    }

    @SuppressLint("SetTextI18n")
    fun answerIsRight(optionButton: View) {
        val selectedOption: Button = optionButton as Button
        selectedOption.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        selectedOption.text = "That's right!"
        correctScore4display += 1
        correctScore.text = (correctScore4display).toString()
        val toastCorrect = Toast.makeText(applicationContext, "You are correct!!!", Toast.LENGTH_LONG)
        toastCorrect.show()
    }

    @SuppressLint("SetTextI18n")
    fun answerIsWrongPhoto(optionButton: View) {
        val selectedOption: Button = optionButton as Button
        selectedOption.setBackgroundColor(Color.parseColor("#FFFFAA95"))
        selectedOption.text = "Oh no..."
        incorrectScore4display += 1
        incorrectScore.text = (incorrectScore4display).toString()
        val toastIncorrect = Toast.makeText(applicationContext, "Incorrect", Toast.LENGTH_LONG)
        toastIncorrect.show()
        if(this.option1Button.text == modelQuiz.getListAnswersPhoto()[0])
        {
            option1Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option2Button.text == modelQuiz.getListAnswersPhoto()[0])
        {
            option2Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option3Button.text == modelQuiz.getListAnswersPhoto()[0])
        {
            option3Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option4Button.text == modelQuiz.getListAnswersPhoto()[0])
        {
            option4Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
    }

    @SuppressLint("SetTextI18n")
    fun answerIsWrongSurf(optionButton: View) {
        val selectedOption: Button = optionButton as Button
        selectedOption.setBackgroundColor(Color.parseColor("#FFFFAA95"))
        selectedOption.text = "Oh no..."
        incorrectScore4display += 1
        incorrectScore.text = (incorrectScore4display).toString()
        val toastIncorrect = Toast.makeText(applicationContext, "Incorrect", Toast.LENGTH_LONG)
        toastIncorrect.show()
        if(this.option1Button.text == modelQuiz.getListAnswersSurf()[0])
        {
            option1Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option2Button.text == modelQuiz.getListAnswersSurf()[0])
        {
            option2Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option3Button.text == modelQuiz.getListAnswersSurf()[0])
        {
            option3Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option4Button.text == modelQuiz.getListAnswersSurf()[0])
        {
            option4Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
    }

    @SuppressLint("SetTextI18n")
    fun answerIsWrongMountains(optionButton: View) {
        val selectedOption: Button = optionButton as Button
        selectedOption.setBackgroundColor(Color.parseColor("#FFFFAA95"))
        selectedOption.text = "Oh no..."
        incorrectScore4display += 1
        incorrectScore.text = (incorrectScore4display).toString()
        val toastIncorrect = Toast.makeText(applicationContext, "Incorrect", Toast.LENGTH_LONG)
        toastIncorrect.show()
        if(this.option1Button.text == modelQuiz.getListAnswersMountains()[0])
        {
            option1Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option2Button.text == modelQuiz.getListAnswersMountains()[0])
        {
            option2Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option3Button.text == modelQuiz.getListAnswersMountains()[0])
        {
            option3Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option4Button.text == modelQuiz.getListAnswersMountains()[0])
        {
            option4Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
    }

    @SuppressLint("SetTextI18n")
    fun answerIsWrongMovies(optionButton: View) {
        val selectedOption: Button = optionButton as Button
        selectedOption.setBackgroundColor(Color.parseColor("#FFFFAA95"))
        selectedOption.text = "Oh no..."
        incorrectScore4display += 1
        incorrectScore.text = (incorrectScore4display).toString()
        val toastIncorrect = Toast.makeText(applicationContext, "Incorrect", Toast.LENGTH_LONG)
        toastIncorrect.show()
        if(this.option1Button.text == modelQuiz.getListAnswersMovies()[0])
        {
            option1Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option2Button.text == modelQuiz.getListAnswersMovies()[0])
        {
            option2Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option3Button.text == modelQuiz.getListAnswersMovies()[0])
        {
            option3Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option4Button.text == modelQuiz.getListAnswersMovies()[0])
        {
            option4Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
    }

    @SuppressLint("SetTextI18n")
    fun answerIsWrongBinary(optionButton: View) {
        val selectedOption: Button = optionButton as Button
        selectedOption.setBackgroundColor(Color.parseColor("#FFFFAA95"))
        selectedOption.text = "Oh no..."
        incorrectScore4display += 1
        incorrectScore.text = (incorrectScore4display).toString()
        val toastIncorrect = Toast.makeText(applicationContext, "Incorrect", Toast.LENGTH_LONG)
        toastIncorrect.show()
        if(this.option1Button.text == modelQuiz.getListAnswersBinary()[0])
        {
            option1Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option2Button.text == modelQuiz.getListAnswersBinary()[0])
        {
            option2Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option3Button.text == modelQuiz.getListAnswersBinary()[0])
        {
            option3Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
        if(this.option4Button.text == modelQuiz.getListAnswersBinary()[0])
        {
            option4Button.setBackgroundColor(Color.parseColor("#FFBFE1A4"))
        }
    }

    override fun onSaveInstanceState(outState: Bundle)
    {
        super.onSaveInstanceState(outState)
        outState.putString("question", questionTextView.text as String)
        outState.putString("option1", option1Button.text as String)
        outState.putString("option2", option2Button.text as String)
        outState.putString("option3", option3Button.text as String)
        outState.putString("option4", option4Button.text as String)
        outState.putString("scoreC", correctScore.text as String)
        outState.putString("scoreI", incorrectScore.text as String)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle)
    {
        super.onRestoreInstanceState(savedInstanceState)
        questionTextView.text = savedInstanceState.getString("question")
        option1Button.text = savedInstanceState.getString("option1")
        option2Button.text = savedInstanceState.getString("option2")
        option3Button.text = savedInstanceState.getString("option3")
        option4Button.text = savedInstanceState.getString("option4")
        correctScore.text = savedInstanceState.getString("scoreC")
        incorrectScore.text = savedInstanceState.getString("scoreI")
    }
}



