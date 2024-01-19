/**Created By Nirali Pandya
 * Date :2024-01-16
 * Time :1:45 p.m.
 * Project Name :Note App
 *
 */
package com.nirali.noteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nirali.noteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class], version = 1
)
abstract class NoteDatabase :RoomDatabase(){

    abstract  val noteDao : NoteDao

    companion object{
        const val  DATABASE_NAME ="notes_db"
    }
}