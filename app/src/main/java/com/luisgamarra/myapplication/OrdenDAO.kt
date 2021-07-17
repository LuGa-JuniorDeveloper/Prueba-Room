package com.luisgamarra.myapplication

import androidx.room.Dao
import androidx.room.Insert
import com.luisgamarra.myapplication.model.Orden

@Dao
interface OrdenDAO {

    @Insert
    suspend fun insert(orden : Orden)

}