/**Created By Nirali Pandya
 * Date :2024-01-19
 * Time :10:29 a.m.
 * Project Name :Note App
 *
 */
package com.nirali.noteapp.feature_note.domain.use_case

import com.nirali.noteapp.feature_note.domain.model.Note
import com.nirali.noteapp.feature_note.domain.repository.NoteRepository

class GetNote(
    private  val repository: NoteRepository
) {
    suspend  operator fun invoke(id:Int): Note?
    {
    return  repository.getNoteById(id)
    }
}