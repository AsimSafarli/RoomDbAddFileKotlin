package com.asimsafar.roomdbaddfile.Repositories

import androidx.lifecycle.LiveData
import com.asimsafar.roomdbaddfile.Models.ProductModel

class ProductRepository(private val productDao: ProductModel) {
    suspend fun insert(product:ProductModel){
        productDao.getAdd(product)
    }

    fun getAllProduct():LiveData<List<ProductModel>>{
        return  productDao.getAllProduct()
    }


}