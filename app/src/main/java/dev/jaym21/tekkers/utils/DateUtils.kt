package dev.jaym21.tekkers.utils

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*

class DateUtils {

    fun convertCurrentTimeMillisToDate(timestamp: Long): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
        sdf.timeZone = TimeZone.getTimeZone("IST")
        return sdf.format(timestamp)
    }

    fun getTimestampFromDate(date: String): Long? {
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
        sdf.timeZone = TimeZone.getTimeZone("IST")
        val d = sdf.parse(date)
        val time = d?.time
        return time?.let { Timestamp(it).time }
    }
}