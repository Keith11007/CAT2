package com.example.recipeapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="mealtype_table")
data class Meal(

    @PrimaryKey(autoGenerate = true) val id:Int?,
    @ColumnInfo()val mealtname: String?,
    @ColumnInfo()val mealtype: String?,
    @ColumnInfo() val numberofpeople:Int?,
    @ColumnInfo() val difficultylevel: String?,
    @ColumnInfo() val ingredients: String?,
    @ColumnInfo()  val steps: String?
)
