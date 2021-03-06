package com.example.android.miwok

import android.app.Activity
import android.media.MediaPlayer
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.LinearLayout


/**
 * Created by Harrison Schmachtenberger on 3/1/2018. <Legal stuff>
 */
class WordAdapter
/**
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate into the lists.
 *
 * @param context        The current context. Used to inflate the layout file.
 * @param words A List of AndroidFlavor objects to display in a list
 */
(context: Activity, words: ArrayList<Word>, private val bgColor: Int)// Here, we initialize the ArrayAdapter's internal storage for the context and the list.
// the second argument is used when the ArrayAdapter is populating a single TextView.
// Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
// going to use this second argument, so it can be any value. Here, we used 0.
    : ArrayAdapter<Word>(
        context,
        0,
        words
) {

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     * list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Check if the existing view is being reused, otherwise inflate the view
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                    R.layout.list_item, parent, false)
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        val currentWord = getItem(position)

        // Find the TextView in the list_item.xml layout with the ID version_name
        val miwokTextView = listItemView!!.findViewById(R.id.miwok_text_view) as TextView
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.text = currentWord!!.miwokTranslation

        val listItemLinearLayout = listItemView.findViewById(R.id.list_linear_layout_bgcolor) as LinearLayout
        listItemLinearLayout.setBackgroundColor(bgColor)

        val listItemPlayButton = listItemView.findViewById(R.id.audio_button) as ImageView

        // Find the TextView in the list_item.xml layout with the ID version_number
        val defaultTextView = listItemView.findViewById(R.id.default_text_view) as TextView
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.text = currentWord.defaultTranslation

        val imageViewMiwok = listItemView.findViewById(R.id.list_item_image) as ImageView

        if (currentWord.checkImage(currentWord.imageResourceId)){
            imageViewMiwok.setImageResource(currentWord.imageResourceId)
            imageViewMiwok.visibility = VISIBLE
        }else{
            imageViewMiwok.visibility = GONE
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView
    }

    companion object {

        private val LOG_TAG = WordAdapter::class.java.simpleName
    }

}
