package com.nirali.noteapp.feature_note.presentation.notes

import com.nirali.noteapp.feature_note.domain.model.Note
import com.nirali.noteapp.feature_note.domain.util.NoteOrder
import com.nirali.noteapp.feature_note.domain.util.OrderType

data class NotesSttate(
    val notes: List<Note> = emptyList(),
    val noteOrder :NoteOrder =NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible :Boolean = false
)
