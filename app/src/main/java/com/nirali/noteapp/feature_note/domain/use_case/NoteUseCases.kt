/**Created By Nirali Pandya
 * Date :2024-01-16
 * Time :2:31 p.m.
 * Project Name :Note App
 *
 */
package com.nirali.noteapp.feature_note.domain.use_case

class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
) {

}