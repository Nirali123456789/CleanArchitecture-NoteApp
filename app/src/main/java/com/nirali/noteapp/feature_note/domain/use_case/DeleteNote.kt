/**Created By Nirali Pandya
 * Date :2024-01-16
 * Time :2:29 p.m.
 * Project Name :Note App
 *
 */
package com.nirali.noteapp.feature_note.domain.use_case

import com.nirali.noteapp.feature_note.domain.model.Note
import com.nirali.noteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)

    }
}