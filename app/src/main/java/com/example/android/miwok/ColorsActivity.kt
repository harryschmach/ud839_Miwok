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
import android.widget.ListView


import java.util.ArrayList

class ColorsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList<Word>()
        words.add(Word("red", "weṭeṭṭi",R.raw.color_red, R.drawable.color_red))
        words.add(Word("mustard yellow", "chiwiiṭә",R.raw.color_mustard_yellow, R.drawable.color_mustard_yellow))
        words.add(Word("dusty yellow", "ṭopiisә", R.raw.color_dusty_yellow, R.drawable.color_dusty_yellow))
        words.add(Word("green", "chokokki", R.raw.color_green, R.drawable.color_green))
        words.add(Word("brown", "ṭakaakki",R.raw.color_brown, R.drawable.color_brown))
        words.add(Word("gray", "ṭopoppi",R.raw.color_gray, R.drawable.color_gray))
        words.add(Word("black", "kululli", R.raw.color_black, R.drawable.color_black))
        words.add(Word("white", "kelelli",R.raw.color_white, R.drawable.color_white))

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        val adapter = WordAdapter(this, words,R.color.category_colors)

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