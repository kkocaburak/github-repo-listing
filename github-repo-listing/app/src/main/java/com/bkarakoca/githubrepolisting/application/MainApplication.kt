package com.bkarakoca.githubrepolisting.application

import android.app.Application
import com.bkarakoca.githubrepolisting.internal.util.NetworkStateHolder.registerConnectivityMonitor
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        registerConnectivityMonitor()
    }
}