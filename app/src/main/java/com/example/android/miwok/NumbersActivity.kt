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

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import java.util.ArrayList
import android.widget.ListView


class NumbersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList<Word>()
        words.add(Word("one", "lutti",R.raw.number_one ,R.drawable.number_one))
        words.add(Word("two", "otiiko",R.raw.number_two, R.drawable.number_two))
        words.add(Word("three", "tolookosu",R.raw.number_three, R.drawable.number_three))
        words.add(Word("four", "oyyisa",R.raw.number_four, R.drawable.number_four))
        words.add(Word("five", "massokka",R.raw.number_five, R.drawable.number_five))
        words.add(Word("six", "temmokka",R.raw.number_six, R.drawable.number_six))
        words.add(Word("seven", "kenekaku",R.raw.number_seven, R.drawable.number_seven))
        words.add(Word("eight", "kawinta",R.raw.number_eight, R.drawable.number_eight))
        words.add(Word("nine", "wo’e",R.raw.number_nine, R.drawable.number_nine))
        words.add(Word("ten", "na’aacha",R.raw.number_ten, R.drawable.number_ten))

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        val adapter = WordAdapter(this, words,R.color.category_numbers)

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        val listView = findViewById<View>(R.id.list) as ListView

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val mMediaResource = words[i].mAudioResourceId
            val mMedia = MediaPlayer.create(this, mMediaResource)
            mMedia.start()
        }
    }
}