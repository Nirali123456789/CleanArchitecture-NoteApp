/**Created By Nirali Pandya
 * Date :2024-01-16
 * Time :2:16 p.m.
 * Project Name :Note App
 *
 */
package com.nirali.noteapp.feature_note.domain.use_case

import com.nirali.noteapp.feature_note.domain.model.Note
import com.nirali.noteapp.feature_note.domain.repository.NoteRepository
import com.nirali.noteapp.feature_note.domain.util.NoteOrder
import com.nirali.noteapp.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes(private val repository: NoteRepository) {

    operator fun invoke(noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when (noteOrder.orderType) {
                is OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }

                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
            }
        }
    }
}