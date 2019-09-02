package com.monofire.mvvmdatabindinglivedata.Database

import androidx.room.Dao
import androidx.room.Query
import androidx.lifecycle.LiveData
import androidx.room.Insert


@Dao
interface QuestionDao {
    @Query("SELECT * from questions_table")
    fun getAllQuestions(): LiveData<List<Questions>>

    @Insert
    fun insert(questions: Questions)


    @Query("DELETE FROM questions_table")
    fun deleteAll()


}