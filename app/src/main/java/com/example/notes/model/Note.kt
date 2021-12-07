package com.example.notes.model

import java.text.SimpleDateFormat
import java.util.*


class Note{

    //
    init{
        val currentDateFormat = SimpleDateFormat("dd/M/yy hh:mm")
        val dateOfCreate = currentDateFormat.format(Date())
    }

    var title: String = ""
    var text: String = ""

}