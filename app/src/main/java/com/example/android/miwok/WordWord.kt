package com.example.android.miwok

/**
 * Created by Harrison Schmachtenberger on 3/7/2018. <Legal stuff>
 */
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

/**
 * [Word] represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
class WordWord {

    /** Default translation for the word  */
    /**
     * Get the default translation of the word.
     */
    var defaultTranslation: String? = null
        private set

    /** Miwok translation for the word  */
    /**
     * Get the Miwok translation of the word.
     */
    var miwokTranslation: String? = null
        private set

    /** Audio resource ID for the word  */
    /**
     * Return the audio resource ID of the word.
     */
    var audioResourceId: Int = 0
        private set

    /** Image resource ID for the word  */
    /**
     * Return the image resource ID of the word.
     */
    var imageResourceId = NO_IMAGE_PROVIDED

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    constructor(defaultTranslation: String, miwokTranslation: String, audioResourceId: Int) {
        this.defaultTranslation = defaultTranslation
        this.miwokTranslation = miwokTranslation
        this.audioResourceId = audioResourceId
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    constructor(defaultTranslation: String, miwokTranslation: String, imageResourceId: Int,
                audioResourceId: Int) {
        this.defaultTranslation = defaultTranslation
        this.miwokTranslation = miwokTranslation
        this.imageResourceId = imageResourceId
        this.audioResourceId = audioResourceId
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    fun hasImage(): Boolean {
        return imageResourceId != NO_IMAGE_PROVIDED
    }

    companion object {

        /** Constant value that represents no image was provided for this word  */
        private const val NO_IMAGE_PROVIDED = -1
    }
}