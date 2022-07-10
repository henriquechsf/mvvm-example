package com.github.henriquechsf.roomwordsample

import android.app.Application
import com.github.henriquechsf.roomwordsample.data.WordRepository
import com.github.henriquechsf.roomwordsample.data.WordRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { WordRoomDatabase.getDatabase(this, applicationScope) } // usado scope para popular alguns dados na inicializacao do app
    val repository by lazy { WordRepository(database.wordDao()) }
}