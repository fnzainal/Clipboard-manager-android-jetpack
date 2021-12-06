package com.jolly.androidx.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CopyDao {

    @Insert
     fun insert(data: Word)

    @Query("SELECT * from copy_table ORDER BY data ASC")
    fun getAllWords(): LiveData<List<Word>>

    @Query("DELETE FROM copy_table")
    fun deleteAll()
}