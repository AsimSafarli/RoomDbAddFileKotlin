package com.asimsafar.roomdbaddfile

import android.app.Application
import com.asimsafar.roomdbaddfile.DB.AppDatabase
import com.asimsafar.roomdbaddfile.Repositories.ProductRepository

class MyApplication:Application() {

    private  val database by lazy { AppDatabase.getData(this) }

    private  val repository by lazy { ProductRepository(database.productDao()) }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}