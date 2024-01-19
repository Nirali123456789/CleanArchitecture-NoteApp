/**Created By Nirali Pandya
 * Date :2024-01-16
 * Time :3:18 p.m.
 * Project Name :Note App
 *
 */
package com.nirali.noteapp.feature_note.domain.use_case

import com.nirali.noteapp.feature_note.domain.model.InvalidNoteException
import com.nirali.noteapp.feature_note.domain.model.Note
import com.nirali.noteapp.feature_note.domain.repository.NoteRepository

class AddNote( private  val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note)
    {
        if (note.title.isBlank())
        {
            throw InvalidNoteException("The title of the note is empty.")
        }
        if (note.content.isBlank())
        {
            throw InvalidNoteException("The content of the note is empty.")
        }
        repository.insertNote(note)
    }

}