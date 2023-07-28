package com.example.recipeapplication

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface MealDao {

    @Query("SELECT *FROM mealtype_table")
    fun getAll(): List<Meal>

    @Query("SELECT *FROM mealtype_table WHERE mealtname LIKE :roll LIMIT 1")
    suspend fun findByRoll(roll:Int):Meal

    @Insert
    suspend fun insert(meal: Meal)
    @Delete
    suspend fun delete(meal: Meal)
    @Query("DELETE FROM mealtype_table")
    suspend fun deleteAll()


}