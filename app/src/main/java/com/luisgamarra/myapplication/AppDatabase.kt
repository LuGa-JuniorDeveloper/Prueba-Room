package com.luisgamarra.myapplication

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.luisgamarra.myapplication.model.Orden

@Database(entities = [Orden::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun ordenDAO() : OrdenDAO

    companion object{

        var instance : AppDatabase? = null

        fun getInstanceBD(context : Context) : AppDatabase {
            if (instance == null){
                instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "telollevo").build()
            }
            return instance as AppDatabase
        }
    }

}