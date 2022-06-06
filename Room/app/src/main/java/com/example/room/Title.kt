package com.example.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "titles")
class Title(@ColumnInfo(name = "note_Title") val title: String, @ColumnInfo(name = "note_content") val text : String ) {
    @PrimaryKey(autoGenerate = true) val id = 0
}