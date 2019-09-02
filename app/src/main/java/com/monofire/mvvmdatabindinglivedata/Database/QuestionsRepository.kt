package com.monofire.mvvmdatabindinglivedata.Database

import android.app.Application
import androidx.lifecycle.LiveData
import android.os.AsyncTask





class QuestionsRepository(application: Application) {
    private var mQuestionsDao: QuestionDao? = null
    private var mAllQuestions: LiveData<List<Questions>>? = null
    val application: Application? = null



    init {

        val db = this.application?.let { QuestionsRoomDatabase.getDatabase(it) }
        mQuestionsDao = db?.wordDao()
        mAllQuestions = mQuestionsDao!!.getAllQuestions()
    }

    fun getmAllQuestions(): LiveData<List<Questions>>? {
        QuestionsRoomDatabase
        return mAllQuestions
    }
    fun insert(word: Questions) {
        mQuestionsDao?.let { insertAsyncTask(it).execute(word) }
    }
    private class insertAsyncTask internal constructor(private val mAsyncTaskDao: QuestionDao) :
        AsyncTask<Questions, Void, Void>() {

        override fun doInBackground(vararg params: Questions): Void? {
            mAsyncTaskDao.insert(params[0])
            return null
        }
    }
}