package com.example.practica2.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity("team")
data class CustomerEntity(
    @ColumnInfo("team") var team: String?,
    @ColumnInfo("año") var anio: String?,
    @ColumnInfo("titulos") var titulos: String?
){
    @PrimaryKey(true)
    @ColumnInfo("customer_id") var customerId: Int=0
}
