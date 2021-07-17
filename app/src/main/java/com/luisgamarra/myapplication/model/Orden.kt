package com.luisgamarra.myapplication.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "orden")
data class Orden(

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "codventa")
    val codventa: String,
    @ColumnInfo(name = "condicion")
    val condicion: String,
    @ColumnInfo(name = "numerocomprobante")
    val numerocomprobante: String,
    @ColumnInfo(name = "pdf")
    val pdf: String,
    @ColumnInfo(name = "pdfx")
    val pdfx: String,
    @ColumnInfo(name = "tipodocumento")
    val tipodocumento: String,
    @ColumnInfo(name = "ventaID")
    val ventaID: String
)