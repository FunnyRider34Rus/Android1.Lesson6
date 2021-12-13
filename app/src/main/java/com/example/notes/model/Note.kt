package com.example.notes.model

import java.text.DateFormat.getDateTimeInstance
import java.util.*


class Note{

    //регистрируем дату и время создания заметки
    init{
        val currentDateFormat = getDateTimeInstance()
        val dateOfCreate = currentDateFormat.format(Date())
    }

    var title: String = ""
    var text: String = ""

}