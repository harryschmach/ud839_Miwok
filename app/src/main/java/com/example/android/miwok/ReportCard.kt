package com.example.android.miwok

/**
 * Created by Harrison Schmachtenberger on 3/5/2018. <Legal stuff>
 */
class ReportCard(private val studentName: String,
                 private val englishGrade: String,
                 private val historyGrade: String,
                 private val mathGrade: String) {

    override fun toString(): String {
        return "Name: $studentName\n" +
                "English Grade: $englishGrade\n" +
                "History Grade: $historyGrade\n" +
                "Math Grade: $mathGrade"
    }
}