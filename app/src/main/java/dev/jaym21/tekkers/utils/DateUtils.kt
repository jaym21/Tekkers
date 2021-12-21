package dev.jaym21.tekkers.utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

class DateUtils {

    fun convertTimeMillisToDate(timestamp: Long): String {
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

    fun getDayOfWeek(timestamp: Long): String {
        val sdf = SimpleDateFormat("EEEE", Locale.ENGLISH)
        return sdf.format(timestamp)
    }

    fun getTimestampsOfDatesForFixtures(): ArrayList<Long?> {

        val currentTimestamp = System.currentTimeMillis()
        val fixtureDates = arrayListOf<Long?>()

        for (i in 10 downTo 1) {
            fixtureDates.add(removeDaysFromTimestamp(i, currentTimestamp))
        }
        fixtureDates.add(currentTimestamp)
        for (i in 1..24) {
            fixtureDates.add(addDaysToTimestamp(i, currentTimestamp))
        }

        return fixtureDates
    }

    private fun addDaysToTimestamp(days: Int, timestamp: Long): Long {
        val daysToMilliseconds = (days * 24 * 60 * 60 * 1000).toLong()
        return timestamp + daysToMilliseconds
    }

    private fun removeDaysFromTimestamp(days: Int, timestamp: Long): Long {
        val daysToMilliseconds = (days * 24 * 60 * 60 * 1000).toLong()
        return timestamp - daysToMilliseconds
    }
}