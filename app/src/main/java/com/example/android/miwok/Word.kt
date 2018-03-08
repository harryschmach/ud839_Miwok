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
{
    /** Default translation for the word  */
    /**
     * Get the default translation of the word.
     */
    var defaultTranslation: String

    /** Miwok translation for the word  */
    /**
     * Get the Miwok translation of the word.
     */
    var miwokTranslation: String

    /** Audio resource ID for the word  */
    /**
     * Return the audio resource ID of the word.
     */
    var audioResourceId: Int

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

    fun checkImage(passedResourceIn: Int): Boolean{
        return passedResourceIn != NO_IMAGE_PROVIDED

    }
    fun giveAudioResource(): Int{
        return audioResourceId
    }

    companion object {

        /** Constant value that represents no image was provided for this word  */
        private const val NO_IMAGE_PROVIDED = -1
    }
}

