package com.luisgamarra.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.luisgamarra.myapplication.model.Orden
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orden = Orden(1,"a","a","a","a","a","a","a")

        lifecycleScope.launch {
            AppDatabase.instance?.ordenDAO()?.insert(orden)
        }
    }
}