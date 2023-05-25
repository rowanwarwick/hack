package com.example.kazan.callback

import android.app.Activity
import android.widget.Toast
import androidx.activity.OnBackPressedCallback

class BackCallback(private val activity: Activity): OnBackPressedCallback(true) {

    private var exit: Long? = null

    override fun handleOnBackPressed() {
        if (System.currentTimeMillis() - (exit ?: 0) > 2000L) {
            Toast.makeText(activity, "Нажмите еще раз для выхода", Toast.LENGTH_SHORT).show()
        } else {
            activity.finish()
        }
        exit = System.currentTimeMillis()
    }
}