/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList
import android.widget.ListView


class NumbersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList < Word >()
        words.add(Word("one", "lutti"))
        words.add(Word("two", "otiiko"))
        words.add(Word("three", "tolookosu"))
        words.add(Word("four", "oyyisa"))
        words.add(Word("five", "massokka"))
        words.add(Word("six", "temmokka"))
        words.add(Word("seven", "kenekaku"))
        words.add(Word("eight", "kawinta"))
        words.add(Word("nine", "wo’e"))
        words.add(Word("ten", "na’aacha"))

        val itemsAdapter = WordAdapter(this, words)

        val listView = findViewById<ListView>(R.id.list)

        listView.adapter = itemsAdapter

//        val rootView = findViewById<LinearLayout>(R.id.rootView)
//
//        // Create a variable to keep track of the current index position
//        var index = 0
//
//        // Keep looping until we've reached the end of the list (which means keep looping
//        // as long as the current index position is less than the length of the list)
//        while (index < words.size) {
//            // Create a new TextView
//            val wordView = TextView(this)
//
//            // Set the text to be word at the current index
//            wordView.text = words.get(index)
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView)
//
//            // Increment the index variable by 1
//            index++
//        }


//        for (for_index in 0 until words.size) {
//            // Create a new TextView
//            val wordView = TextView(this)
//
//            // Set the text to be word at the current index
//            wordView.text = words[for_index]
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView)
//        }
    }
}