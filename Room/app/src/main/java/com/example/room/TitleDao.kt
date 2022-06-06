package com.example.room

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface TitleDao {
    @Insert
    suspend fun insert(title: Title)

    @Delete
    suspend fun delete(title: Title)

    @Query("SELECT * from titles ORDER BY id ASC")
    fun getAllNotes() : LiveData<List<Title>>



}