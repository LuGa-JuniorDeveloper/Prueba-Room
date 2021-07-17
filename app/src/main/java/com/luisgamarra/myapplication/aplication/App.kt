package com.luisgamarra.myapplication.aplication

import android.app.Application
import com.luisgamarra.myapplication.AppDatabase

class App : Application(){

    lateinit var database : AppDatabase

    override fun onCreate() {
        super.onCreate()
        database = AppDatabase.getInstanceBD(this)
    }
}