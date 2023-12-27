package com.asimsafar.roomdbaddfile.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.asimsafar.roomdbaddfile.Models.ProductModel

@Database(entities = [ProductModel::class], version = 1)
abstract class AppDatabase:RoomDatabase() {

    abstract fun  productDao():ProductModel

    companion object{
        private var database:AppDatabase? = null

        fun  getData(context: Context):AppDatabase{
            if (database !== null){
                return database!!
            }else{
                database=Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "demodb").build()
                return database!!
            }
        }
    }
}