package com.monofire.mvvmdatabindinglivedata.Database

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.room.PrimaryKey
import android.R.id





@Entity(tableName = "questions_table")
data class Questions(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private val id: Int = 0,

    @ColumnInfo(name = "question")
    private val question: String = "",

    @Nullable
    @ColumnInfo(name = "answer")
    private val answer: String? = "",

    @Nullable
    @ColumnInfo(name = "optA")
    private val optA: String? = "",

    @Nullable
    @ColumnInfo(name = "optB")
    private val optB: String? = "",

    @Nullable
    @ColumnInfo(name = "optC")
    private val optC: String? = ""){


}