package com.example.android.miwok

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by Harrison Schmachtenberger on 3/29/2018. <Legal stuff>
 */
class SimpleFragmentPagerAdapter(context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var mContext: Context? = context

    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NumbersFragment()
            1 -> FamilyFragment()
            2 -> ColorsFragment()
            else -> PhrasesFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> mContext!!.getString(R.string.category_numbers)
            1 -> mContext!!.getString(R.string.category_family)
            2 -> mContext!!.getString(R.string.category_colors)
            else -> mContext!!.getString(R.string.category_phrases)
        }
    }
}