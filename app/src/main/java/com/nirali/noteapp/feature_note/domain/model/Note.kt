package com.nirali.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nirali.noteapp.ui.theme.LightBlue
import com.nirali.noteapp.ui.theme.LightGreen
import com.nirali.noteapp.ui.theme.LightPink
import com.nirali.noteapp.ui.theme.LightRed
import com.nirali.noteapp.ui.theme.LightViolet
import com.nirali.noteapp.ui.theme.Magenta
import com.nirali.noteapp.ui.theme.RedOrange
import java.lang.Exception

@Entity
data class Note(
    val title:String,
    val content:String,
    val timestamp:Long,
    val color:Int,
    @PrimaryKey val id :Int? = null

)
{
    companion object{
        val noteColors = listOf(RedOrange,LightGreen,LightBlue,LightRed,LightViolet,Magenta,LightPink)
    }
}

class InvalidNoteException(msg:String): Exception(msg)
