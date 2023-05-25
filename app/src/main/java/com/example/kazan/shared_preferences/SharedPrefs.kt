package com.example.kazan.shared_preferences

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs {
    companion object {

        private const val KEY = "hackathon"

        fun setValue(context: Context, key: String, value: String) {
            val sharedPrefs: SharedPreferences = context.getSharedPreferences(KEY, Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPrefs.edit()
            editor.putString(key, value)
            editor.apply()
        }

        fun getValue(context: Context, key: String): String {
            val sharedPrefs: SharedPreferences = context.getSharedPreferences(KEY, Context.MODE_PRIVATE)
            return sharedPrefs.getString(key, "") ?: ""
        }

    }
}