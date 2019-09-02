package com.monofire.mvvmdatabindinglivedata

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.monofire.mvvmdatabindinglivedata.Database.QuestionsRepository
import com.monofire.mvvmdatabindinglivedata.Database.Questions
import androidx.lifecycle.LiveData


class QuestionsViewModel(application: Application) : AndroidViewModel(application) {

    private val mRepository: QuestionsRepository = QuestionsRepository(application)

    private val allQuestions: LiveData<List<Questions>>?

    init {
        allQuestions = mRepository.getmAllQuestions()
    }

    fun insert(word: Questions) {
        mRepository.insert(word)
    }
}