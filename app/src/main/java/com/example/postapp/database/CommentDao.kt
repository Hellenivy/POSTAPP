package com.example.postapp.database

import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface CommentDao {
    @Insert(OnConflict= OnConflictStrategy.REPLACE)
}