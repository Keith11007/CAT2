package com.example.recipeapplication

import androidx.room.Dao
import androidx.room.Query


@Dao
interface MealDao {

    @Query("SELECT *FROM mealtype_table")
    fun getAll(): List<Meal>
}