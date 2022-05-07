package com.example.quizapp

object Constants  {

    const val user_name: String = "user_name"
    const val correct_answers: String = "10 "


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()





        val que1 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_argentina,
             "Argentina", "Australia", "Venezuela", "Mexico",
             1
         )

        questionList.add(que1)
        val que2 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_australia,
            "Iraq", "Australia", "Russia", "China",
            2
        )

        questionList.add(que2)
        val que3 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_belgium,
            "Belgium", "Taiwan", "Italy", "Brazil",
            1
        )

        questionList.add(que3)
        val que4 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_brazil,
            "Bhutan", "Uganda", "Nepal", "Brazil",
            4
        )

        questionList.add(que4)

        val que5 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_denmark,
            "Italy", "Afghanistan", "Denmark", "Sweden",
            3
        )

        questionList.add(que5)
        val que6 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_fiji,
            "Russia", "England", "Fiji", "Brazil",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_germany,
            "Belgium", "Germany", "Iran", "Turkey",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_india,
            "India", "Uzbekistan", "Romania", "Bangladesh",
            1
        )

        questionList.add(que8)

        val que9 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_kuwait,
            "Qatar", "Jordan", "Italy", "Kuwait",
            4
        )

        questionList.add(que9)

        val que10 = Question(
            1, "Which country does this flag belongs to?", R.drawable.ic_flag_of_new_zealand,
            "USA", "New Zealand", "Austria", "Australia",
            2
        )

        questionList.add(que10)

        return questionList
    }
}