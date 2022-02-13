package com.example.quiz

class ModeloQuiz {
    private var indexQuestion = 0
    private val numbers = mutableListOf(0,1,2,3,4)
    private var count = 0

    //Photos category
    private val questionsPhoto : List<String> = listOf("DSLR stands for", "Advantage of shooting manual?", "What is a pixel?", "Best ISO for the no noise?", "Shutter speed for action shots?")
    private val answersPhoto1: List<String> = listOf("Digital single lens reflex", "Digital single light reflex", "Digital single lens refraction","Digital single light refraction")
    private val answersPhoto2: List<String> = listOf("More creative control", "Exposures are always correct", "Sharper images", "B&W photography")
    private val answersPhoto3: List<String> = listOf("Single square unit of information ", "100th of a mega pixel", "The speed of the shutter ", "Paint interactive system")
    private val answersPhoto4: List<String> = listOf("ISO 100", "ISO 6400", "Automatic ISO", "ISO 800")
    private val answersPhoto5: List<String> = listOf("1/4000", "1/8", "1/500", "1/2000")
    private val answersPhotos : List<List<String>> = listOf(answersPhoto1,answersPhoto2,answersPhoto3,answersPhoto4,answersPhoto5)

    //Mountains category
    private val questionsMountain : List<String> = listOf("Mexico’s highest mountain?", "# of mountains over 8000m?", "Most dangerous mountain?", "What is Iztacchihuatl’s height?", "Not one of the Seven Summits")
    private val answersMountain1: List<String> = listOf("Pico de Orizaba", "Iztacchihuatl", "Popocatepetl","Nevado de Toluca")
    private val answersMountain2: List<String> = listOf("14", "7", "5", "3")
    private val answersMountain3: List<String> = listOf("K2 ", "Denali", "Mt.Everest", "Matterhorn")
    private val answersMountain4: List<String> = listOf("5,230m", "5,426m", "4,461m", "6,708m")
    private val answersMountain5: List<String> = listOf("Lhotse", "Kilimanjaro", "Vinson", "Aconcagua")
    private val answersMountains : List<List<String>> = listOf(answersMountain1,answersMountain2,answersMountain3,answersMountain4,answersMountain5)

    //Surf category
    private val questionsSurf : List<String> = listOf("Ideal for big-wave surfing?", "Surfboard for 1m waves?", "1st Surf Olympics?", "Product used to increase grip?", "% (time) riding waves in session?")
    private val answersSurf1: List<String> = listOf("Nazare", "Acapulco", "Sayulita","Biarritz")
    private val answersSurf2: List<String> = listOf("Longboard", "Shortboard", "Foam shortboard", "Gun")
    private val answersSurf3: List<String> = listOf("Tokyo", "Rio de Janeiro", "London", "Sochi")
    private val answersSurf4: List<String> = listOf("Wax", "Water", "Sand", "Algae oil")
    private val answersSurf5: List<String> = listOf("8%", "27%", "64%", "78%")
    private val answersSurf : List<List<String>> = listOf(answersSurf1,answersSurf2,answersSurf3,answersSurf4,answersSurf5)

    //Movies category
    private val questionsMovies : List<String> = listOf("Balloons in Up?", "Who inspired Norman Bates?", "When was the first motion picture?", "Who invented the Cinématographe?", "Movie with the highest lifetime gross?")
    private val answersMovies1: List<String> = listOf("10,297", "3,873", "15,073","5,194")
    private val answersMovies2: List<String> = listOf("Ed Gein", "Ted Bundy", "Jack the Ripper", "Harold Shipman")
    private val answersMovies3: List<String> = listOf("1888", "1624", "The speed of the shutter ", "Paint interactive system")
    private val answersMovies4: List<String> = listOf("Lumière Brothers", "Jacques Cousteau", "Louis Pasteur", "Louis Braille")
    private val answersMovies5: List<String> = listOf("Avatar", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens")
    private val answersMovies : List<List<String>> = listOf(answersMovies1,answersMovies2,answersMovies3,answersMovies4,answersMovies5)

    //Binary category
    private val questionsBinary : List<String> = listOf("How is 15 represented ?", "What number is 1101?", "What is 0101 plus 0011?", "Language based on binary?", "Smallest unit of storage in a computer?")
    private val answersBinary1: List<String> = listOf("1111", "0000", "1010","1011")
    private val answersBinary2: List<String> = listOf("13", "12", "3", "6")
    private val answersBinary3: List<String> = listOf("1000", "0001", "0111", "0110")
    private val answersBinary4: List<String> = listOf("Braille", "Mandarin", "Arabic", "ASCIUP")
    private val answersBinary5: List<String> = listOf("Bit", "Byte", "Word", "Pixel")
    private val answersBinary : List<List<String>> = listOf(answersBinary1,answersBinary2,answersBinary3,answersBinary4,answersBinary5)

    //Functions Photo
    fun questionPhoto() : String{
        //val numbers = 0..4
        val randomNumber = numbers.random()
        indexQuestion = randomNumber
        numbers.remove(randomNumber)
        count+=1
        if (count == 5){
            numbers.add(0)
            numbers.add(1)
            numbers.add(2)
            numbers.add(3)
            numbers.add(4)
            count = 0
        }
        return questionsPhoto[randomNumber]
    }

    fun getListAnswersPhoto() : List<String>
    {
        return answersPhotos[indexQuestion]
    }
}

