package com.example.room

import androidx.lifecycle.LiveData

class TitleRepository(private val titleDao: TitleDao) {
    val allTitles: LiveData<List<Title>> = titleDao.getAllNotes()

    suspend fun insert(title: Title){
        titleDao.insert(title)
    }

}