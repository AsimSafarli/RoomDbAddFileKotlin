package com.asimsafar.roomdbaddfile.Daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.asimsafar.roomdbaddfile.Models.ProductModel

@Dao
interface ProductDao {
    abstract fun getAllProduct(): LiveData<List<ProductModel>>


    @Insert
    suspend fun getAdd(product: ProductModel)

    @Delete
    suspend fun getDelete(product: ProductModel)

    @Update
    fun getUptade(product: ProductModel)




}