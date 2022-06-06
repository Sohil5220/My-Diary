package com.example.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class TitleViewModel(application: Application):AndroidViewModel(application) {

    val allTitles: LiveData<List<Title>>

    init {
        val dao = TitleDatabase.getDatabase(application).titleDao()
        val repository = TitleRepository(dao)

        allTitles = repository.allTitles
    }
}