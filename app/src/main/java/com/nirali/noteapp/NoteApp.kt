/**Created By Nirali Pandya
 * Date :2024-01-16
 * Time :2:31 p.m.
 * Project Name :Note App
 *
 */
package com.nirali.noteapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NoteApp: Application() {

    override fun onCreate() {
        super.onCreate()
    }


}