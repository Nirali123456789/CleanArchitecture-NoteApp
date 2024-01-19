package com.nirali.noteapp.di

import android.content.Context
import androidx.room.Room
import com.nirali.noteapp.NoteApp
import com.nirali.noteapp.feature_note.data.data_source.NoteDatabase
import com.nirali.noteapp.feature_note.data.repository.NoteRepositoryImpl
import com.nirali.noteapp.feature_note.domain.repository.NoteRepository
import com.nirali.noteapp.feature_note.domain.use_case.AddNote
import com.nirali.noteapp.feature_note.domain.use_case.DeleteNote
import com.nirali.noteapp.feature_note.domain.use_case.GetNote
import com.nirali.noteapp.feature_note.domain.use_case.GetNotes
import com.nirali.noteapp.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(@ApplicationContext appContext: Context): NoteDatabase {
        return Room.databaseBuilder(
            appContext, NoteDatabase::class.java, NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)

        )
    }
}