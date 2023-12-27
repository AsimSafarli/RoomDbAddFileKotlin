package com.asimsafar.roomdbaddfile.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProductModel(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "product_name") val productName: String?,
    @ColumnInfo(name = "product_description")val productDescription:String?
    )
