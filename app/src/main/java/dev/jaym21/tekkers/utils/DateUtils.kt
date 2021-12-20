package dev.jaym21.tekkers.utils

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {

    fun convertUnixToDate(timestamp: Long): String {
        val sdf = SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH)
        sdf.timeZone = TimeZone.getTimeZone("IST")
        return sdf.format(timestamp * 1000)
    }
}