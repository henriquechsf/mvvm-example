package com.github.henriquechsf.roomwordsample

import android.app.Application
import com.github.henriquechsf.roomwordsample.data.WordRepository
import com.github.henriquechsf.roomwordsample.data.WordRoomDatabase

class WordApplication : Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}