package com.github.henriquechsf.roomwordsample.data

import androidx.annotation.WorkerThread
import com.github.henriquechsf.roomwordsample.domain.Word
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWord()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}