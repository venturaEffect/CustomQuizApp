package com.example.customquizapp

object Constants {

    const val USER_NAME : String ="user_name"
    const val TOTAL_QUESTIONS :String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question> ()
        // 1
        val que1 = Question(
            1, "From where is this food?",
            R.drawable.img,
            "Argentina", "Turkey",
            "Armenia", "Austria",
            2
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "From where is this food?",
            R.drawable.img_1,
            "Spain", "Austria",
            "Australia", "Argentina", 4
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "From where is this food?",
            R.drawable.img_2,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "From where is this food?",
            R.drawable.img_3,
            "Bahamas", "Spain",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "From where is this food?",
            R.drawable.img_4,
            "Gabon", "China",
            "Fiji", "Finland", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "From where is this food?",
            R.drawable.img_5,
            "Cuba", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "From where is this food?",
            R.drawable.img_6,
            "Dominica", "Egypt",
            "Thailand", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.img_7,
            "Ireland", "Iran",
            "Hungary", "England", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.img_8,
            "Australia", "Vietnam",
            "Tuvalu", "Marocco", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.img_9,
            "Marocco", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)
        // 11
        val que11 = Question(
            11, "From which country belongs this food?",
            R.drawable.img_como_hacer_fondue_de_queso_42216_orig,
            "Finland", "Switzerland",
            "France", "Germany", 1
        )

        questionsList.add(que11)

        return questionsList
    }
}