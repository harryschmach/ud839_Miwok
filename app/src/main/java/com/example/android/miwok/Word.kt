package com.example.android.miwok

/**
 * Created by Harrison Schmachtenberger on 3/1/2018. <Legal stuff>
 */
class Word
/**
 * Create a new Word object.
 *
 * @param defaultTranslation is the word in a language that the user is already familiar with
 * (such as English)
 * @param miwokTranslation is the word in the Miwok language
 */
(
    /** Default translation for the word  */
        /**
     * Get the default translation of the word.
     */
    val defaultTranslation: String,
    /** Miwok translation for the word  */
        /**
     * Get the Miwok translation of the word.
     */
    val miwokTranslation: String,

        private val NO_IMAGE_PROVIDED: Int = -1,

        var mImageResourceId: Int = NO_IMAGE_PROVIDED


) {
    fun checkImage(passedResourceIn: Int): Boolean{
        return passedResourceIn != NO_IMAGE_PROVIDED
    }
}

