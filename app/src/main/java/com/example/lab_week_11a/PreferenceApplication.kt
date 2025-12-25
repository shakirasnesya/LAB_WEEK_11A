package com.example.lab_week_11

import android.app.Application

class PreferenceApplication : Application() {
    lateinit var preferenceWrapper: PreferenceWrapper
    override fun onCreate() {
        super.onCreate()

        preferenceWrapper = PreferenceWrapper(
            getSharedPreferences(
                "prefs",
                MODE_PRIVATE
            )
        )
    }
}