package com.monofire.mvvmdatabindinglivedata.Database

import android.content.Context
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room
import androidx.sqlite.db.SupportSQLiteDatabase


@Database(entities = [Questions::class], version = 1)
abstract class QuestionsRoomDatabase : RoomDatabase() {

    abstract fun wordDao(): QuestionDao

    companion object{
        private val sRoomDatabaseCallback = object : RoomDatabase.Callback(){}
        private var INSTANCE: QuestionsRoomDatabase? = null

        fun getDatabase(context: Context): QuestionsRoomDatabase? {
            if (INSTANCE == null) {
                synchronized(QuestionsRoomDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            QuestionsRoomDatabase::class.java, "questions"
                        )
                            // Wipes and rebuilds instead of migrating if no Migration object.
                            // Migration is not part of this codelab.
                            .fallbackToDestructiveMigration()
                            .addCallback(sRoomDatabaseCallback)
                            .build()
                    }
                }
            }
            return INSTANCE
        }

    }


}